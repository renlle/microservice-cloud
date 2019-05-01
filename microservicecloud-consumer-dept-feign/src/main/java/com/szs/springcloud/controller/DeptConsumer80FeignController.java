package com.szs.springcloud.controller;

import com.szs.springcloud.entities.Dept;
import com.szs.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Copyright (C), 2018-2019, ZhengZhouChuangZhi. Co., Ltd.
 * FileName: ${FILENAME}
 * 类的详细说明
 *
 * @author 宋泽山
 * @version 1.0
 * @Date 2019/5/1 17:54
 */
@RestController
public class DeptConsumer80FeignController {
    @Autowired
    private DeptClientService deptClientService = null;

    @RequestMapping(value = "/")
    public String welcome(){
        return "welcome ,this is consumer 80 Feign !";
    }

    @RequestMapping(value = "/add/{deptName}")
    public boolean add(@PathVariable("deptName")String deptName){
        return deptClientService.add(deptName);
    }

    @RequestMapping(value = "/findById/{id}")
    public Dept findById(@PathVariable("id")Long id){
        return deptClientService.findById(id);
    }
    /**
     *   测试输出调用路径 System.out.println(this.getClass()+"------------------");
     */
    @RequestMapping(value = "/findAll")
    public List findAll(){

        return deptClientService.findAll();
    }

}
