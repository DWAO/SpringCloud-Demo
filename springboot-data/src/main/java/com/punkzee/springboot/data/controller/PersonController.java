package com.punkzee.springboot.data.controller;

import com.punkzee.springboot.data.dao.PersonRepository;
import com.punkzee.springboot.data.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/save")
    public Person save(String name, String address, Integer age) {
        Person p = personRepository.save(new Person(null, address, name, age));
        return p;
    }

    @RequestMapping("/q1")
    public List<Person> q1(String address) {
        List<Person> list = personRepository.findByAddress(address);
        return list;
    }

    @RequestMapping("/q2")
    public Person q2(String name, String address) {
        Person p = personRepository.findByNameAndAddress(name, address);
        return p;
    }

//    @RequestMapping("/q3")
//    public Person q3(String name, String address) {
//        Person p = personRepository.withNameAndAddressQuery(name, address);
//        return p;
//    }

//    @RequestMapping("/q4")
//    public Person q4(String name, String address) {
//        Person p = personRepository.withNameAndAddressNamedQuery(name, address);
//        return p;
//    }

    @RequestMapping("/sort")
    public List<Person> sort() {
        List<Person> list = personRepository.findAll(new Sort(Sort.Direction.ASC, "age"));
        return list;
    }

    @RequestMapping("/page")
    public Page<Person> page() {
        Page<Person> pagePeople = personRepository.findAll(new PageRequest(1,2));
        return pagePeople;
    }
}
