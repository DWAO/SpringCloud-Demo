package com.punkzee.swagger.dao;

import com.punkzee.swagger.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String name);


}
