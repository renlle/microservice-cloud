package myribbonrule;

import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import  java.util.List;
 import java.util.concurrent.ThreadLocalRandom;

import  com.netflix.client.config.IClientConfig;
import  com.netflix.loadbalancer.ILoadBalancer;
import  com.netflix.loadbalancer.Server;
/**
 * Copyright (C), 2018-2019, ZhengZhouChuangZhi. Co., Ltd.
 * FileName: ${FILENAME}
 * 类的详细说明 :  照抄了gitHub上的RandomRule源码
 *             然后自定义规则 : 要求
 * @author 宋泽山
 * @version 1.0
 * @Date 2019/5/1 11:28
 */
public class RandomRule_EachFive extends AbstractLoadBalancerRule {
    /*
        总共被调用的次数，目前要求每台被调用2次再轮询下一个
     */
    private  int  total  = 0;
    /*
        当前提供服务的机器号
     */
    private  int  currentIndex  = 0;

    /**
     * Randomly choose from all living servers
     */
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }
        Server server = null;

        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
            List<Server> upList = lb.getReachableServers();
            List<Server> allList = lb.getAllServers();

            int serverCount = allList.size();
            if (serverCount == 0) {
                /*
                 * No servers. End regardless of pass, because subsequent passes
                 * only get more restrictive.
                 */
                return null;
            }
            /** 重写分配算法
             *   currentIndex  = 0; 当前提供服务的机器号的下标
             *   int  total  = 0;  总共被调用的次数
             */
//            int index = chooseRandomInt(serverCount);
//            server = upList.get(index);
            // 对应 0,1,2  -->
            total++;
            if(total < 3){
                server = upList.get(currentIndex);
            }else{
                total=1;
                currentIndex++;
                if(currentIndex == 3){
                    currentIndex = 0;
                }
                server = upList.get(currentIndex);
            }



            if (server == null) {
                /*
                 * The only time this should happen is if the server list were
                 * somehow trimmed. This is a transient condition. Retry after
                 * yielding.
                 */
                Thread.yield();
                continue;
            }

            if (server.isAlive()) {
                return (server);
            }

            // Shouldn't actually happen.. but must be transient or a bug.
            server = null;
            Thread.yield();
        }

        return server;

    }

    protected int chooseRandomInt(int serverCount) {
        return ThreadLocalRandom.current().nextInt(serverCount);
    }

    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }
}