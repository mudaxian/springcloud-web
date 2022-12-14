package com.mudaxian.springcloud.controller;

import com.mudaxian.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/query/list")
    private List<Dept> queryAll(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/query/list",List.class);
    }

    @RequestMapping ("/query/byid/{id}")
    public Dept queryDeptByID(@PathVariable("id") int id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/query/byid/"+id,Dept.class);
    }

    @RequestMapping("/query/add/{deptname}")
    public boolean addDept(@PathVariable("deptname")String deptname){
        return restTemplate.getForObject(REST_URL_PREFIX+"/query/add/"+deptname,Boolean.class);
    }
}
