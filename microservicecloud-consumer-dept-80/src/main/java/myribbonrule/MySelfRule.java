package myribbonrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright (C), 2018-2019, ZhengZhouChuangZhi. Co., Ltd.
 * FileName: ${FILENAME}
 * 类的详细说明
 *
 * @author 宋泽山
 * @version 1.0
 * @Date 2019/5/1 11:14
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        /**默认的轮询算法*/
        //return new RoundRobinRule();
        /**随机唤醒算法*/
//        return new RandomRule();
        /**重试策略  -- 不生效
         * 先按照RoundRobinRule的策略获取服务，
         * 如果获取服务失败则在指定时间内会进行重试，获取可用的服务
         * 跳过出问题的服务,寻找存存活的服务
         * */
        return new RandomRule_EachFive();
    }
}
