package com.mudaxian.springcloud.dao;

import com.mudaxian.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {
    boolean addDept(String deptname);

    Dept queryDeptByID(int id);

    List<Dept> queryAll();
}
