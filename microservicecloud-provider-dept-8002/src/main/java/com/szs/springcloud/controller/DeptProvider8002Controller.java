package com.szs.springcloud.controller;

import com.szs.springcloud.entities.Dept;
import com.szs.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
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
public class DeptProvider8002Controller {

    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/add/{deptName}" ,method = RequestMethod.GET)
    public boolean addDept(@PathVariable(name = "deptName") String deptName) {
        //add?deptName=喝茶酱油部
        Dept dept = new Dept();
        dept.setDeptName(deptName);

        return deptService.addDept(dept);
    }
    /**添加上:  produces = "application/json"*/
    @RequestMapping(value = "/findById/{id}",method = RequestMethod.GET)
    public Dept findById(@PathVariable(name = "id") Long id) {
        //返回结果举例子: {"deptNo":1,"deptName":"开发部","dbSource":"clouddb01"}
        return deptService.findById(id);
    }

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<Dept> findAll() {
        List<Dept>  list= deptService.findAll();
        return list;
    }

    @RequestMapping(value = "/discovery",method = RequestMethod.GET)
    public Object discovery(){
        //返回Eureka所有的服务
        List<String> list = discoveryClient.getServices();
        System.out.println("*******服务发现*******"+list);

        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("microservicecloud-provider-dept-8001");
        for (ServiceInstance e : serviceInstanceList){
            System.out.println(e.getServiceId()+"\t"+e.getHost()+"\t"+e.getPort()+"\t"+e.getUri()+"\n");
        }
        return  discoveryClient;
    }
}
