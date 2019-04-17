package com.szs.springcloud.controller;

import com.szs.springcloud.entities.Dept;
import com.szs.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Copyright (C), 2018-2019, ZhengZhouChuangZhi. Co., Ltd.
 * FileName: ${FILENAME}
 * 类的详细说明
 *
 * @author 宋泽山
 * @version 1.0
 * @Date 2019/4/16 17:17
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/findById")
    public Dept findById(@RequestParam("id") Long id) {
        //返回结果举例子: {"deptNo":1,"deptName":"开发部","dbSource":"clouddb01"}
        return deptService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Dept> findAll() {
        List<Dept>  list= deptService.findAll();
        return list;
    }

    @GetMapping(value = "/add")
    public boolean addDept(@RequestParam("deptName")String deptName) {
        //add?deptName=喝茶酱油部
        Dept dept = new Dept();
        dept.setDeptName(deptName);
        return deptService.addDept(dept);
    }

}
