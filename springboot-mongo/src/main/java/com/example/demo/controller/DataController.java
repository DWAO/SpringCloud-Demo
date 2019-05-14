package com.example.demo.controller;

import com.example.demo.dao.PersonRepository;
import com.example.demo.domain.Location;
import com.example.demo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by Administrator on 2018-10-21.
 */
@RestController
public class DataController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/save")
    public Person save(){
        Person p = new Person("zorpz", 24);
        Collection<Location> list = new LinkedHashSet<Location>();
        Location loc1 = new Location("2010", "汕头");
        Location loc2 = new Location("2013", "东莞");
        Location loc3 = new Location("2017", "深圳");

        list.add(loc1);
        list.add(loc2);
        list.add(loc3);

        p.setLocations(list);
        return personRepository.save(p);
    }

    @RequestMapping("/q1")
    public Person q1(String name) {
        return personRepository.findByName(name);
    }

    @RequestMapping("/q2")
    public List<Person> q2(Integer age) {
        return personRepository.withQueryFindByAge(age);
    }
}
