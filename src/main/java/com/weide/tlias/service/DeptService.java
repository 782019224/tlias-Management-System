package com.weide.tlias.service;

import com.weide.tlias.pojo.Dept;

import java.util.List;

/**
 * 部门管理
 */
public interface DeptService {

    /*查询全部部门数据*/
    List<Dept> list();
}
