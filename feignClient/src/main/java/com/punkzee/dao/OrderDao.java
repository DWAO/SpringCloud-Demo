package com.punkzee.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2018-9-24.
 */
@FeignClient(value = "eureka-client", fallback = OrderDaoHystrix.class)
public interface OrderDao {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();
}
