package com.anggraan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExerAnnotationApp
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("exerFootballCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
    }
}
