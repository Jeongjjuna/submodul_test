package com.example.sub_module_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SubModuleTestApplication {

    public static void main(String[] args) {

        System.out.println("테스트입니다.");

        SpringApplication.run(SubModuleTestApplication.class, args);
    }

}
