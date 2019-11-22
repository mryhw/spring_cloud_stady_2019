package com.mr.msconsumerfeign.controller;

import com.mr.msapi.entity.Dept;
import com.mr.msapi.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 消费端代码
 * @Author      yanghanwei
 * @Mail        yanghanwei@geotmt.com
 * @Date        17:20 2019-11-11
 * @Version     v1
 **/
@RestController
@RequestMapping("api/consumer-feign/")
public class DespConsumerController {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "getById", method = RequestMethod.POST)
    public Map<String,Object> getById(@RequestParam Integer id) {
        System.out.println(" ================ 8001 ==============");
        return deptClientService.getById(id);
    }


    @RequestMapping(value = "save", method = RequestMethod.GET)
    public Map<String,Object> save(@RequestBody Dept dept) {

        return deptClientService.save(dept);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public Map<String,Object> list() {

        return deptClientService.list();
    }




}









