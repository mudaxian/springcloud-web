package com.mudaxian.springcloud.service;

import com.mudaxian.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    boolean addDept(String deptname);

    Dept queryDeptByID(int id);

    List<Dept> queryAll();
}
