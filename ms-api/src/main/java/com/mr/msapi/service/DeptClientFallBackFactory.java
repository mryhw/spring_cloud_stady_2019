package com.mr.msapi.service;

import com.mr.msapi.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 服务降级
 * @Author      yanghanwei
 * @Mail        yanghanwei@geotmt.com
 * @Date        11:48 2019-11-18
 * @Version     v1
 **/
@Component
public class DeptClientFallBackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Map<String, Object> getById(Integer id) {
                Map<String, Object> map = new HashMap<>(2);
                map.put("result", id + " ，消费者服务暂时不可用，请稍后再试");
                return map;
            }

            @Override
            public Map<String, Object> save(Dept dept) {
                return null;
            }

            @Override
            public Map<String, Object> list() {
                return null;
            }
        };
    }
}
