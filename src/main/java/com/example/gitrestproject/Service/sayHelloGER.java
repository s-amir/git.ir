package com.example.gitrestproject.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("german")
public class sayHelloGER implements sayHello
{
    @Override
    public String sayHello(String name) {
        return "halo "+name;
    }
}
