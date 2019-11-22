package com.mr.msapi.service;

import com.mr.msapi.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Description 类描述
 * @Author      yanghanwei
 * @Mail        yanghanwei@geotmt.com
 * @Date        17:16 2019-11-12
 * @Version     v1
 **/
//@FeignClient(value = "MS-PROVIDER")
@FeignClient(value = "MS-PROVIDER", fallbackFactory = DeptClientFallBackFactory.class)
public interface DeptClientService {

    /**
     * 注意 ：1.feign 不能使用 @GetMapping  @PostMapping
     *       2. POST传参 必须使用 @RequestParam("") ,而且必须得有 value 值
     *       3. GET传参 必须使用 @PathVariable(""), 必须有 value 值
     *       4. POST对象传参 必须使用 @RequestBody
     */

    @RequestMapping(value = "/api/dept/getById", method = RequestMethod.POST)
    Map<String,Object> getById(@RequestParam("id") Integer id);

    @RequestMapping("/api/dept/save")
    Map<String,Object> save(Dept dept);

    @RequestMapping("/api/dept/list")
    Map<String,Object> list();

}
