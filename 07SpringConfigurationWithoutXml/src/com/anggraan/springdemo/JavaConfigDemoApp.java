package com.anggraan.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp
{
    public static void main(String[] args)
    {
        // read spring config class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);
    }
}
