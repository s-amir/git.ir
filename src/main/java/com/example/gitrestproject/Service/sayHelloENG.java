package com.example.gitrestproject.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("english")
public class sayHelloENG implements sayHello {
    @Override
    public String sayHello(String name) {
        return "hello "+ name;
    }
}
