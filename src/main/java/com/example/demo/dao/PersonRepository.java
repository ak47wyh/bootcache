package com.example.demo.dao;

import com.example.demo.vo.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/6/7.
 */
public interface PersonRepository extends JpaRepository<Person,Long> {

    Person findByNameStartsWith(String name);
}
