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
public class DeptProvider8001Controller {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/add/{deptName}" ,method = RequestMethod.GET, produces = "application/json")
    public boolean addDept(@PathVariable(name = "deptName") String deptName) {
//        add?deptName=喝茶酱油部
        Dept dept = new Dept();
        dept.setDeptName(deptName);

        return deptService.addDept(dept);
    }

    @RequestMapping(value = "/findById/{id}",method = RequestMethod.GET, produces = "application/json")
    public Dept findById(@PathVariable(name = "id") Long id) {
        //返回结果举例子: {"deptNo":1,"deptName":"开发部","dbSource":"clouddb01"}
        return deptService.findById(id);
    }

    @RequestMapping(value = "/findAll",method = RequestMethod.GET, produces = "application/json")
    public List<Dept> findAll() {
        List<Dept>  list= deptService.findAll();
        return list;
    }

}
