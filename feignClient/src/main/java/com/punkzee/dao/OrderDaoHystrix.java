package com.punkzee.dao;


import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018-9-24.
 */
@Component
public class OrderDaoHystrix implements OrderDao {

    @Override
    public String hello() {
        return "你的网络已上九重天！";
    }
}
