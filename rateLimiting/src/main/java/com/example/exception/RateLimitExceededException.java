package com.example.exception;

public class RateLimitExceededException extends Exception{
    public RateLimitExceededException(String errorMessage) {
        super(errorMessage);
    }
}
