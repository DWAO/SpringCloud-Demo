package com.example.demo.dao;

import com.example.demo.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
/**
 * Created by Administrator on 2018-10-21.
 */
public interface PersonRepository extends MongoRepository<Person, String> {
    Person findByName(String name);

    @Query("{'age':?0}")
    List<Person> withQueryFindByAge(Integer age);
}
