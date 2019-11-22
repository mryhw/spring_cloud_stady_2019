package com.mr.msprovider.controller;

import com.mr.msapi.entity.Dept;
import com.mr.msprovider.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/dept/")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("getById")
    @HystrixCommand(fallbackMethod = "fallbackGetById")
    public Map<String,Object> getById(@RequestParam Integer id)  {
        System.out.println(" ================ 8001 ==============");
        Map<String, Object> map = new HashMap<>();
        if(deptService.getById(id) == null) {
            throw new RuntimeException("不存在");
        }
        map.put("result", deptService.getById(id));
        map.put("server", "8001");
        return map;
    }

    public Map<String,Object> fallbackGetById(@RequestParam Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", "提供者" + id + "不存在");
        map.put("server", "8001");
        return map;
    }


    @RequestMapping("save")
    public Map<String,Object> save(@RequestBody Dept dept) {
        Map<String, Object> map = new HashMap<>();
        deptService.save(dept);
        map.put("result", dept.getId());
        return map;
    }

    @RequestMapping("list")
    public Map<String,Object> list() {
        Map<String, Object> map = new HashMap<>();
        map.put("result", deptService.list());
        return map;
    }

}
