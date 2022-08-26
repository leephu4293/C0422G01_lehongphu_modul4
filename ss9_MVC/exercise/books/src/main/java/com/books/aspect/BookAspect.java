package com.books.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


import java.util.Arrays;

@Aspect
@Component
public class BookAspect {
    private static int count=1;

    @AfterReturning(pointcut = "execution(* com.books.controller.BooksController.borrow(..))")
    public void countBorrow(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        String arg = Arrays.toString(joinPoint.getArgs());

        System.err.println("method"+methodName+"da chay xong");
        System.err.println(arg);

    }
    @AfterReturning(pointcut = "execution(* com.books.controller.BooksController.giveBack(..))")
    public void countGive(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        String arg = Arrays.toString(joinPoint.getArgs());

        System.err.println("method"+methodName+"da chay xong");
        System.err.println(arg);

    }
    @Before( value = "execution(* com.books.controller.BooksController.*(..))")
    public void visit(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        count++;
        System.err.println("Method " + methodName + "da chay xong so lan"+ count + ")");
    }

}
