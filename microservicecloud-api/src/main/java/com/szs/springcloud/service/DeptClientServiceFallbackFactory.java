package com.szs.springcloud.service;

import com.szs.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Copyright (C), 2018-2019, ZhengZhouChuangZhi. Co., Ltd.
 * FileName: ${FILENAME}
 * 类的详细说明 ; 熔断器hystrix 的服务降级
 *                自动返回异常处理
 *      @Component 别忘了!!
 *
 * @author 宋泽山
 * @version 1.0
 * @Date 2019/5/2 11:19
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(String deptName) {
                return false;
            }

            @Override
            public Dept findById(Long id) {
                return new Dept().setDbSource("服务降级中,数据库暂时无法访问").setDeptNo(id).setDeptName("没有对应的Dept信息" +
                        "Consumer客户端提供的降级信息");
            }

            @Override
            public List findAll() {
                return null;
            }
        };
    }
}
