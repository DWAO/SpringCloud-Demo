package com.punkzee.springboot.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Administrator on 2018-9-10.
 */
@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class ZuuaController {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ZuuaController.class).run(args);
    }
}

