package com.example.demo.service.impl;

import com.example.demo.dao.PersonRepository;
import com.example.demo.domain.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018-10-21.
 */
@Service
public class PersonServiceImpl implements PersonService {


    @Autowired
    private PersonRepository personRepository;

    @Override
    @CachePut(value = "person", key = "#person.id")
    public Person save(Person person) {
        Person p = personRepository.save(person);
        System.out.println("id="+p.getId()+"加入到缓存");
        return p;
    }

    @Override
    @CacheEvict(value = "person")
    public void remove(Long id) {
        System.out.println("id="+id+"已从缓存中移除");
        personRepository.deleteById(id);
    }

    @Override
    @Cacheable(value = "person", key="#person.id")
    public Person findOne(Person person) {
        Person p = personRepository.findById(person.getId()).get();
        System.out.println("为id="+person.getId()+"做了缓存！");
        return p;
    }
}
