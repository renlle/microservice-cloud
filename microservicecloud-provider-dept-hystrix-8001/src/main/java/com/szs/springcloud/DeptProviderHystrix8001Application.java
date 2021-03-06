package com.szs.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2018-2019, ZhengZhouChuangZhi. Co., Ltd.
 * FileName: ${FILENAME}
 * 类的详细说明
 *@EnableCircuitBreaker   对hystrixR熔断机制的支持
 * @author 宋泽山
 * @version 1.0
 * @Date 2019/4/16 17:23
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
public class DeptProviderHystrix8001Application {

    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix8001Application.class, args);
    }
}
