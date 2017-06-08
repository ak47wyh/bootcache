package com.example.demo.web;

import com.example.demo.service.PersonService;
import com.example.demo.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/8.
 */
@RestController
public class PersonControl {

    @Autowired
    private PersonService personService;

    @RequestMapping("/put")
    public Person put(Person person){
        Person p = personService.save(person);
        return p;
    }

    @RequestMapping("/able")
    public Person able(Person person){
        Person p = personService.findOne(person);
        return p;
    }

    @RequestMapping("/evit")
    public String evit(Long id){
        personService.remove(id);
        return "ok";
    }
}
