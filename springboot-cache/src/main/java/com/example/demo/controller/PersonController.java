package com.example.demo.controller;

import com.example.demo.domain.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018-10-21.
 */
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/put")
    public Person put(Person person) {
        return personService.save(person);
    }

    @RequestMapping("/able")
    public Person cacheble(Person person) {
        return personService.findOne(person);
    }

    @RequestMapping("/evit")
    public String evit(Long id) {
        personService.remove(id);
        return "ok";
    }
}
