package com.mr.msconsumer.controller;

import com.mr.msapi.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @Description 消费端代码
 * @Author      yanghanwei
 * @Mail        yanghanwei@geotmt.com
 * @Date        17:20 2019-11-11
 * @Version     v1
 **/
@RestController
@RequestMapping("api/consumer/")
public class DespConsumerController {

//    private static final String  REST_PRE_URL="http://localhost:8001";
    private static final String  REST_PRE_URL="http://MS-PROIVIDER";

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("save")
    public Map save(@RequestBody Dept dept){
        return restTemplate.postForObject(REST_PRE_URL + "/api/dept/save", dept, Map.class);
    }

    @RequestMapping("getById")
    public Map save(Integer id){
        return restTemplate.getForObject(REST_PRE_URL + "/api/dept/getById?id="+id, Map.class);
    }

    @RequestMapping("list")
    public Map save(){
        return restTemplate.getForObject(REST_PRE_URL + "/api/dept/list", Map.class);
    }





}
