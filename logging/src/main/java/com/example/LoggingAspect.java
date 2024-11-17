package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    /**
     * This function is used to log Hello World.
     * @param joinPoint
     */
    @Before("execution(* com.example.*.*(..))")
    public void logBeforeHelloWorld(JoinPoint joinPoint) {
        logger.info("Entering method: {} with arguments {}", joinPoint.getSignature(), joinPoint.getArgs());
    }

    @Before("execution(* com.example.routes.Routes.*(..))")
    public void logBeforeHome(JoinPoint joinPoint) {
        logger.info("Logs before entering {} ", joinPoint.getSignature());
    }

    @Before("execution(* com.example.routes.CommandRoutes.*(..))")
    public void logBeforeCommandRoute(JoinPoint joinPoint) {
        logger.info("Entering route: {} ", joinPoint.getSignature());
    }

    @After("execution(* com.example.routes.CommandRoutes.*(..))")
    public void logAfterCommandRoute(JoinPoint joinPoint) {
        logger.info("Sending information back to client. Command is finished");
    }

    @Before("execution(* com.example.commands.CreateProductCommand.*(..))")
    public void logBeforeCreateProductCommand(JoinPoint joinPoint) {
        logger.info("Entering command: {} ", joinPoint.getSignature());
    }

    @After("execution(* com.example.commands.CreateProductCommand.*(..))")
    public void logAfterCreateProductCommand(JoinPoint joinPoint) {
        logger.info("Command has finished executing.");
    }

    @Before("execution(* com.example.repository.ProductRepository.*(..))")
    public void logBeforeMongoDBRepository(JoinPoint joinPoint) {
        logger.info("Accessing database to store the data");
    }

    @After("execution(* com.example.repository.ProductRepository.*(..))")
    public void logAfterMongoDBRepository(JoinPoint joinPoint) {
        logger.info("Exiting database");
    }


    // Log after a method has successfully executed
    @After("execution(* com.ims.crochet_v2.Application.*.*(..))")
    public void logAfterController(JoinPoint joinPoint) {
        logger.info("Exiting method: {}", joinPoint.getSignature());
    }

    // Log around method execution (before and after, and potentially log execution time)
    @Around("execution(* com.ims.crochet_v2.Application.*.*(..))")
    public Object logAroundController(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result;

        logger.info("Starting method: {} with arguments: {}", joinPoint.getSignature(), joinPoint.getArgs());
        try {
            result = joinPoint.proceed();  // Execute the method
        } catch (Throwable e) {
            logger.error("Exception in method: {} with message: {}", joinPoint.getSignature(), e.getMessage());
            throw e;
        }
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Method: {} executed in {} ms", joinPoint.getSignature(), timeTaken);

        return result;
    }

    // Log exceptions thrown by any method
    @AfterThrowing(pointcut = "execution(* com.ims.crochet_v2.*.*.*(..))", throwing = "exception")
    public void logExceptions(JoinPoint joinPoint, Throwable exception) {
        logger.error("Exception in method: {} with cause: {}", joinPoint.getSignature(), exception.getMessage());
    }
}
