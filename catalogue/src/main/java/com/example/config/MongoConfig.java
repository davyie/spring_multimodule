package com.example.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {

//    @Bean
//    public MongoClient mongoClient() {
//        return MongoClients.create("mongodb+srv://ims:N9ihlRBrzTlipQDZ@crochet-ims.lblyt.mongodb.net/?retryWrites=true&w=majority&appName=crochet-ims");
//    }
//
//    @Bean
//    public MongoTemplate mongoTemplate() {
//        return new MongoTemplate(mongoClient(), "crochet-ims");
//    }
}
