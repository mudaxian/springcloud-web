package com.mudaxian.springcloud.service;

import com.mudaxian.springcloud.dao.DeptDao;
import com.mudaxian.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    DeptDao deptDao;

    @Override
    public boolean addDept(String deptname) {
        return deptDao.addDept(deptname);
    }

    @Override
    public Dept queryDeptByID(int id) {
        return deptDao.queryDeptByID(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
