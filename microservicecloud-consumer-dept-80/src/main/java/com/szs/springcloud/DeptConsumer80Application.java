package com.szs.springcloud;
import myribbonrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

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
@RibbonClient(name = "MICROSERVICECLOUD-PROVIDER-DEPT",configuration= MySelfRule.class)
public class DeptConsumer80Application {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80Application.class, args);
    }
}
