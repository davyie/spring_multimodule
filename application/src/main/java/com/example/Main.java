package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
@EnableMongoRepositories(basePackages = "com.example")
public class Main {
    public static void main(String[] args) {
        SpringApplication application =  new SpringApplication(Main.class);
        application.run(args);
    }
}