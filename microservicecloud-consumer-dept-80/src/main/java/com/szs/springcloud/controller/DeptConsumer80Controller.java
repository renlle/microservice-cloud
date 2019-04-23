package com.szs.springcloud.controller;

import com.szs.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;

/**
 * Copyright (C), 2018-2019, ZhengZhouChuangZhi. Co., Ltd.
 * FileName: ${FILENAME}
 * 类的详细说明
 *
 * @author 宋泽山
 * @version 1.0
 * @Date 2019/4/19 20:11
 */
@RestController
public class DeptConsumer80Controller {
    /**
     * RestTemplate提供了多种便捷访问远程Http服务的方法， 
     * 是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模板工具集
     *       
     * 使用restTemplate 访问restful接口非常的简单粗暴;
     * (url,        requestMap,     ResponseBean.class)  这三个参数分别代表
     * REST请求地址  /请求参数   /Http响应转换被转换成的对象类型!
     *
     */

    @Autowired
    private RestTemplate restTemplate;
    /**
     * 老的写法:     //  public static String REST_URL_PREFIX = "http://localhost:8001/provider";
     *  要点:
     *      Ribbon 和Eureka 整合后Consumer 可以直接调用服务 而不用再关心地址和端口号!!
     */
    public static String REST_URL_PREFIX = "http://MICROSERVICECLOUD-PROVIDER-DEPT-8001/provider";



    @RequestMapping(value = "/")
    public String welcome(){
        return "welcome ,this is consumer 80 !";
    }

    @RequestMapping(value = "/add/{deptName}")
    public boolean add(@PathVariable(name = "deptName")String deptName){
        HashMap<String,String> map =new HashMap<>(2);
        map.put("deptName", deptName);
        return restTemplate.getForObject(REST_URL_PREFIX+"/add/{deptName}", Boolean.class,map);
    }

    @RequestMapping(value = "/findById/{id}")
    public Dept findById(@PathVariable(name = "id")Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/findById/{id}", Dept.class,id);
    }
    /**
     * @description
     * @suppresswarnings 就是告诉编译器忽略警告。不用在编译完成后出现警告
     * @author 宋泽山
     * @date 2019/4/21 15:56
     * @param
     * @return
     */
//    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/findAll")
    public List findAll(){
        System.out.println(restTemplate+"---------"+restTemplate.getErrorHandler());
        return restTemplate.getForObject(REST_URL_PREFIX+"/findAll",List.class);
    }
    /**
     * @description 消费者端的服务发现
     * @author 宋泽山
     * @date 2019/4/21 15:30
     * @param
     * @return
     */
    @RequestMapping(value = "/discovery",method = RequestMethod.GET)
    public Object discovery() {
        System.out.println("消费者端的服务发现\n");
        return restTemplate.getForObject(REST_URL_PREFIX+"/discovery",Object.class);
    }
}
