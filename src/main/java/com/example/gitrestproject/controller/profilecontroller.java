package com.example.gitrestproject.controller;

import com.example.gitrestproject.Service.sayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/profile")
public class profilecontroller {
    @Autowired
    sayHello sayHello;

    @RequestMapping(path = "/{name}")
    public String sayhello(@PathVariable(name = "name") String name){
       return sayHello.sayHello(name);

    }
}
