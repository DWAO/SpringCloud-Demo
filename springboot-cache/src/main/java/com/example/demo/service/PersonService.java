package com.example.demo.service;

import com.example.demo.domain.Person;

/**
 * Created by Administrator on 2018-10-21.
 */
public interface PersonService {
    public Person save(Person person);

    public void remove(Long id);

    public Person findOne(Person person);
}
