package com.szs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Copyright (C), 2018-2019, ZhengZhouChuangZhi. Co., Ltd.
 * FileName: ${FILENAME}
 * 类的详细说明  :hystrix dashboard
 *
 * @author 宋泽山
 * @version 1.0
 * @Date 2019/4/19 20:35
 */

@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer9001HystrixDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer9001HystrixDashboardApplication.class, args);
    }
}
