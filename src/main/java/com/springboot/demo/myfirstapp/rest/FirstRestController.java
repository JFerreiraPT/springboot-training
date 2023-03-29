package com.springboot.demo.myfirstapp.rest;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    public FirstRestController() {
        System.out.println("on Constructor");
    }
    @GetMapping("/")
    public String sayHello() {
        return  "Hello World";
    }

    @PostConstruct
    public void testPostConstruct() {
        System.out.println("In post constructor");
    }

    @GetMapping("/Hello")
    public String test() {
        return "Just checking";
    }

    @PreDestroy()
    public void clean() {
        System.out.println("This method is called right before destruction");
    }

}
