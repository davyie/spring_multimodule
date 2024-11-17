package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Collections;

@SpringBootApplication(scanBasePackages = "com.example")
@EnableMongoRepositories(basePackages = "com.example")
public class Main {
    public static void main(String[] args) {

        SpringApplication application =  new SpringApplication(Main.class);
//        application.setDefaultProperties(Collections.singletonMap(
//                "spring.data.mongodb.uri",
//                "mongodb+srv://ims:N9ihlRBrzTlipQDZ@crochet-ims.lblyt.mongodb.net/?retryWrites=true&w=majority&appName=crochet-ims"));
        application.run(args);
    }
}