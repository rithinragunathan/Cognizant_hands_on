package com.cognizant.spring.com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("execution(* com.cognizant.spring.service.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        Object result = joinPoint.proceed();
        long startTime = System.currentTimeMillis();

        System.out.println("started logging");

        long endTime = System.currentTimeMillis();
        System.out.println("logged time : " + (endTime - startTime) + " ms");
        return result;

    }
    
}
