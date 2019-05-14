package com.punkzee.swagger.service;

import com.punkzee.swagger.dao.UserDao;
import com.punkzee.swagger.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User findUserByName(String name){
        return userDao.findByUsername(name);
    }

    public List<User> findAll () {
        return userDao.findAll();
    }

    public User saveUser(User user) {
        return userDao.save(user);
    }

    public User updateUser (User user) {
        return userDao.saveAndFlush(user);
    }

    public void deleteUser (Long id) {
        userDao.delete(id);
    }
}
