package com.example.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import java.util.Date;

@Aspect
@Component
public class MyAspect {
    Date start;
    Date end;

    @Before("execution(* com.example.demo..*.print(..))")
    public void before() {
        start = new Date();
    }

    @After("execution(* com.example.demo..*.print(..))")
    public void after() {
        end = new Date();
        long time = end.getTime() - start.getTime();
        System.out.println("總共執行了 : " + time + " ms");
    }
}