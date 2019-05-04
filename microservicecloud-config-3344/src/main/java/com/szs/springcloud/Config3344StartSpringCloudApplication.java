package com.szs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
* Copyright (C), 2018-2019, ZhengZhouChuangZhi. Co., Ltd.
* FileName: Config3344StartSpringCloudApplication
* 类的详细说明
*
* @author 宋泽山
* @date 2019/5/3 15:18
* @version 1.0
*/
@SpringBootApplication
@EnableConfigServer
public class Config3344StartSpringCloudApplication {
	public static void main(String[] args)
	{
		SpringApplication.run(Config3344StartSpringCloudApplication.class, args);
	}
}
