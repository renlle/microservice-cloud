package com.szs.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Copyright (C), 2018-2019, ZhengZhouChuangZhi. Co., Ltd.
 * FileName: ${FILENAME}
 * 类的详细说明 : dept部门实体类
 *              // entity --orm(ORM 把数据库映射成对象)--- db_table
 *              // @Accessors(chain=true) 启用链式风格
 * @author 宋泽山
 * @version 1.0
 * @Date 2019/4/16 15:39
 */
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable {
    /** 主键,部门号*/
    private Long 	deptNo;
    /** 部门名称*/
    private String 	deptName;
    /**来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库*/
    private String 	dbSource;

}