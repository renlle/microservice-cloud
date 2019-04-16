package com.szs.springcloud.service.impl;
import com.szs.springcloud.dao.DeptDao;
import com.szs.springcloud.entities.Dept;
import com.szs.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Copyright (C), 2018-2019, ZhengZhouChuangZhi. Co., Ltd.
 * FileName: ${FILENAME}
 * 类的详细说明
 *
 * @author 宋泽山
 * @version 1.0
 * @Date 2019/4/16 16:59
 */
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao;

    @Override
    public boolean addDept(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> findAll() {
        return dao.findAll();
    }
}
