package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Order(0)
@Component
public class CommandRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("==========================");
        System.out.println("CommandLineRunner: " + Arrays.toString((args)));
        System.out.println("==========================");
    }
}
