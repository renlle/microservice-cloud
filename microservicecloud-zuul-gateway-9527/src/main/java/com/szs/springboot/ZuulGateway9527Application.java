package com.szs.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Copyright (C), 2018-2019, ZhengZhouChuangZhi. Co., Ltd.
 * FileName: ${FILENAME}
 * 类的详细说明
 *@EnableZuulProxy   网管关口!!
 * @author 宋泽山
 * @version 1.0
 * @Date 2019/4/16 17:23
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulGateway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway9527Application.class,args);
    }
}
