package com.mudaxian.springcloud.controller;

import com.mudaxian.springcloud.pojo.Dept;
import com.mudaxian.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Restful服务提供者
@RestController
public class DeptController {
    @Autowired
    DeptService deptService;

    @GetMapping("/query/list")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }

    @GetMapping("/query/byid/{id}")
    public Dept queryDeptByID(@PathVariable("id") int id){
        return deptService.queryDeptByID(id);
    }

    @GetMapping("/query/add/{deptname}")
    public boolean addDept(@PathVariable("deptname")String deptname){
        return deptService.addDept(deptname);
    }
}
