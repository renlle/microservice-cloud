package com.szs.springcloud.controller;

import com.szs.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


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
public class DeptConsumerController {
    /**
     * 使用restTemplate 访问restful接口非常的简单粗暴;
     * (url,        requestMap,     ResponseBean.class)  这三个参数分别代表
     * REST请求地址  /请求参数   /Http响应转换被转换成的对象类型!
     *
     */
    private static final String REST_URL_PREFIX = "http://localhost:8001/provider";

    @Autowired(required=false)
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add")
    public boolean add(@RequestParam("deptName")String deptName){
        return restTemplate.postForObject(REST_URL_PREFIX+"/add", deptName, Boolean.class);
    }

    @RequestMapping(value = "/findById")
    public Dept findById(Integer id){
        return restTemplate.postForObject(REST_URL_PREFIX+"/findById", id, Dept.class);
    }
    /**
     * .[dispatcherServlet] : Servlet.service() for servlet [dispatcherServlet] in context with path [/consumer]
     *          threw exception [Request processing failed; nested exception is java.lang.NullPointerException] with root cause
    * @description
    * @author Song ZeShan
    * @date 2019/4/20 9:51
    * @param
    * @return
    */
    @RequestMapping(value = "/findAll")
    public List<Dept> findAll(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/findAll",List.class);
    }
}
