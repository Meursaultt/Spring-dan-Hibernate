package com.anggraan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExerDemoApp
{
    public static void main(String[] args)
    {
        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from container
        Coach coach = context.getBean("exerPingPongCoach", Coach.class);

        // call a method on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // close the context
        context.close();
    }
}
