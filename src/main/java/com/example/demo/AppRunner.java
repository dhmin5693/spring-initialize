package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("==========================");
        System.out.println("ApplicationRunner: " + Arrays.toString(args.getSourceArgs()));
        System.out.println("==========================");
    }
}
