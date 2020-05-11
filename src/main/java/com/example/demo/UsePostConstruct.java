package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class UsePostConstruct {

    @PostConstruct
    public void init() {
        System.out.println("==========================");
        System.out.println("PostConstruct");
        System.out.println("==========================");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("==========================");
        System.out.println("PreDestroy");
        System.out.println("==========================");
    }
}
