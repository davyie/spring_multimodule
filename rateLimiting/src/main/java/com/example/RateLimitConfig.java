package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Configuration
public class RateLimitConfig {

    @Value("${rate.limit.requests}")
    private int requests;

    @Value("${rate.limit.seconds}")
    private int seconds;
}
