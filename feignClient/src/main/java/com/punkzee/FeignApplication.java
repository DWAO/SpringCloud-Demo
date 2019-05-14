package com.punkzee;

import com.punkzee.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018-9-24.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableFeignClients
public class FeignApplication {

    @Autowired
    private OrderDao dao;

    public static void main(String[] args) {
        new SpringApplicationBuilder(FeignApplication.class).web(true).run(args);
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello1() {
        return "hello1";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
       return dao.hello();
    }

}
