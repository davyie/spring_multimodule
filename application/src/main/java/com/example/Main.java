package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example")
@EnableConfigurationProperties(RateLimitConfig.class)
public class Main {
    public static void main(String[] args) {
        SpringApplication application =  new SpringApplication(Main.class);
        application.run(args);
    }
}