package com.mr.msprovider.controller;

import com.mr.msapi.entity.Dept;
import com.mr.msprovider.service.DeptService;
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
    public Map<String,Object> getById(@RequestParam Integer id) {
        System.out.println(" ================ 8003 ==============");
        Map<String, Object> map = new HashMap<>();
        map.put("result", deptService.getById(id));
        map.put("server", "8003");
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
