package com.example.demo.dao;

import com.example.demo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018-10-21.
 */
@Repository
public class PersonDao {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource(name = "stringRedisTemplate")
    ValueOperations<String, String> valOpsStr;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Resource(name ="redisTemplate")
    private ValueOperations<Object, Object> valOpsObject;

    public void stringRedisTemplate() {
        valOpsStr.set("xx", "yy");
    }

    public String getString() {
        return valOpsStr.get("xx");
    }

    public void save(Person person) {
        valOpsObject.set(person.getId(), person);
    }

    public Person getPerson () {
        return (Person) valOpsObject.get("1");
    }
}
