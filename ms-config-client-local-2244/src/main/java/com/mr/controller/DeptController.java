package com.mr.controller;

import com.mr.msapi.entity.Dept;
import com.mr.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 类描述
 * @Author      yanghanwei
 * @Mail        yanghanwei@geotmt.com
 * @Date        16:41 2019-11-19
 * @Version     v1
 **/
@RestController
@RequestMapping("api/client-local/")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Value("${mysqlllael}")
    private String mysqlllael;

    @Value("${servercommon}")
    private String servercommon;

    @Value("${mysqlcommon}")
    private String mysqlcommon;

    @RequestMapping("getById/{id}")
    public Map<String,Object> getById(@PathVariable Integer id) {
        Map<String, Object> map = new HashMap<>(3);
        map.put("result", deptService.getById(id));
        map.put("server", "8002");
        map.put("mysqlLabel", mysqlllael);
        map.put("servercommon", servercommon);
        map.put("mysqlcommon", mysqlcommon);
        return map;
    }


    @RequestMapping("save")
    public Map<String,Object> save(@RequestBody Dept dept) {
        Map<String, Object> map = new HashMap<>();
        deptService.save(dept);
        map.put("result", dept.getId());
        map.put("mysqlLabel", mysqlllael);
        map.put("servercommon", servercommon);
        map.put("mysqlcommon", mysqlcommon);
        return map;
    }

    @RequestMapping("list")
    public Map<String,Object> list() {
        Map<String, Object> map = new HashMap<>();
        map.put("result", deptService.list());
        map.put("mysqlLabel", mysqlllael);
        map.put("servercommon", servercommon);
        map.put("mysqlcommon", mysqlcommon);
        return map;
    }

}
