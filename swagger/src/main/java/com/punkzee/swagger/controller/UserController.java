package com.punkzee.swagger.controller;

import com.punkzee.swagger.entity.User;
import com.punkzee.swagger.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value="查找用户", notes = "根据用户名进行查找")
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return userService.findUserByName(username);
    }
}
