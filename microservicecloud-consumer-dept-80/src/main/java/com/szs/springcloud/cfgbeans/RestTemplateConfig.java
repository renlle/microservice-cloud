package com.szs.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;


/**
 * RestTemplate配置
 * 这是一种JavaConfig的容器配置，用于spring容器的bean收集与注册，并通过参数传递的方式实现依赖注入。
 * "@Configuration"注解标注的配置类，都是spring容器配置类，springboot通过"@EnableAutoConfiguration"
 * 注解将所有标注了"@Configuration"注解的配置类，"一股脑儿"全部注入spring容器中。
 *
 * @author 原文：https://blog.csdn.net/u014745069/article/details/78801405
 *
 */

@Configuration
public class RestTemplateConfig {
    /**
     * 完整真正的通过微服务名字从eureka 上找到并访问
     *
     * spring Cloud Ribbon 是基于netflix Ribbon实现的一套客户端, 负载均衡的工具;
     *                  使用@LoadBalanced即可!默认是轮询方式!!1-2-3-1-2-3
     * @description 创建产生RestTemplate 的类
     * @author 宋泽山
     * @date 2019/4/23 19:55
     * @param
     * @return RestTemplate rest接口模板
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    /**
     * 用我们重新选择的随机算法替代默认的轮询算法 : RandomRule
     */
//    @Bean
//    public IRule myRule(){
//        /**默认的轮询算法*/
//        //return new RoundRobinRule();
//        /**随机唤醒算法*/
////        return new RandomRule();
//        /**重试策略  -- 不生效
//         * 先按照RoundRobinRule的策略获取服务，
//         * 如果获取服务失败则在指定时间内会进行重试，获取可用的服务
//         * 跳过出问题的服务,寻找存存活的服务
//         * */
//        return new RetryRule();
//    }
}