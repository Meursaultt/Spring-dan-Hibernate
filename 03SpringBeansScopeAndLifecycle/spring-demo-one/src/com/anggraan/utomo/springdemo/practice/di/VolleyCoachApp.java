package com.anggraan.utomo.springdemo.practice.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VolleyCoachApp
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        VolleyCoach theCoach = context.getBean("myVolleyCoach", VolleyCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
    }
}
