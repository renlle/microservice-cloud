package com.szs.springcloud.service;

import com.szs.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Copyright (C), 2018-2019, ZhengZhouChuangZhi. Co., Ltd.
 * FileName: ${FILENAME}
 * 类的详细说明
 *
 * @author 宋泽山
 * @version 1.0
 * @Date 2019/5/1 17:31
 */
//@FeignClient(value = "MICROSERVICECLOUD-PROVIDER-DEPT/provider")
@FeignClient(value = "MICROSERVICECLOUD-PROVIDER-DEPT/provider",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/add/{deptName}")
    boolean add(@PathVariable(name = "deptName")String deptName);

    @RequestMapping(value = "/findById/{id}")
    Dept findById(@PathVariable(name = "id")Long id);

    @RequestMapping(value = "/findAll")
    List findAll();
}

