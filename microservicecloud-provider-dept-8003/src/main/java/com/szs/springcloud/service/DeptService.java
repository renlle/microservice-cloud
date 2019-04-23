package com.szs.springcloud.service;

import com.szs.springcloud.entities.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright (C), 2018-2019, ZhengZhouChuangZhi. Co., Ltd.
 * FileName: ${FILENAME}
 * 类的详细说明
 *
 * @author 宋泽山
 * @version 1.0
 * @Date 2019/4/16 16:57
 */

public interface DeptService {
    public boolean addDept( Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
