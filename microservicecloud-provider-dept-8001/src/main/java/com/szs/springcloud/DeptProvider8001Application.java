package com.szs.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2018-2019, ZhengZhouChuangZhi. Co., Ltd.
 * FileName: ${FILENAME}
 * 类的详细说明
 *
 * @author 宋泽山
 * @version 1.0
 * @Date 2019/4/16 17:23
 */
@Component
@SpringBootApplication
@MapperScan(value = "com.szs.springcloud.dao")
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider8001Application {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001Application.class, args);
    }
}
