package com.example.demo.service;

import com.example.demo.vo.Person;

/**
 * Created by Administrator on 2017/6/8.
 */
public interface PersonService {

    Person save(Person person);

    void remove(Long id);

    Person findOne(Person person);
}
