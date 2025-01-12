package com.example;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example")
@EnableConfigurationProperties(RateLimitConfig.class)
//@EnableJpaRepositories
public class Main {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().load();

        // Set environment variables to system properties
        dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));

        SpringApplication application =  new SpringApplication(Main.class);
        application.run(args);
    }
}