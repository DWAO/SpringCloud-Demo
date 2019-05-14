package com.example.demo.controller;

import com.example.demo.dao.PersonDao;
import com.example.demo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018-10-21.
 */
@RestController
public class PersonController {

    @Autowired
    private PersonDao personDao;

    @RequestMapping("/set")
    public void set() {
        Person p = new Person("1", "zorpz", 24);
        personDao.save(p);
        personDao.stringRedisTemplate();
    }

    @RequestMapping("/getStr")
    public String getStr() {
        return personDao.getString();
    }

    @RequestMapping("/getPerson")
    public Person getPerson(){
        return personDao.getPerson();
    }
}
