package com.weide.tlias.service.impl;

import com.weide.tlias.mapper.DeptMapper;
import com.weide.tlias.pojo.Dept;
import com.weide.tlias.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }
}

