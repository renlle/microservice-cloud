package com.szs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Copyright (C), 2018-2019, ZhengZhouChuangZhi. Co., Ltd.
 * FileName: ${FILENAME}
 * 类的详细说明
 * @EnableEurekaClient
 * @RibbonClient(name = "MICROSERVICECLOUD-PROVIDER-DEPT",configuration=MySelfRule.class)
 *            在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
 *
 * @author 宋泽山
 * @version 1.0
 * @Date 2019/4/19 20:35
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.szs.springcloud"})
public class DeptConsumer80FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80FeignApplication.class, args);
    }
}
