package com.szs.springcloud.dao;

import com.szs.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Copyright (C), 2018-2019, ZhengZhouChuangZhi. Co., Ltd.
 * FileName: ${FILENAME}
 * 类的详细说明DeptDao : 增删改查
 *
 * @author 宋泽山
 * @version 1.0
 * @Date 2019/4/16 16:26
 */
@Mapper
public interface DeptDao {

     boolean addDept( Dept dept);

     Dept findById(Long id);

     List<Dept> findAll();
}
