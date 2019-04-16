package com.szs.springcloud.controller;

import com.szs.springcloud.entities.Dept;
import com.szs.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/findById")
    public Dept findById(Long id) {
        return deptService.findById(id);
    }

    @GetMapping("/dept/findAll")
    public List<Dept> findAll() {
        return deptService.findAll();
    }

}
