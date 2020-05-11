package com.example.demo;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

import java.util.Arrays;

//@Component
public class AppStartingEvent implements ApplicationListener<ApplicationStartingEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        System.out.println("==========================");
        System.out.println("ApplicationStartingEvent: " + Arrays.toString(applicationStartingEvent.getArgs()));
        System.out.println("==========================");
    }
}