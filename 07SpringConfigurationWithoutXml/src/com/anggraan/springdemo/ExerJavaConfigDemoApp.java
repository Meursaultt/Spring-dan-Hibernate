package com.anggraan.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExerJavaConfigDemoApp
{
    public static void main(String[] args)
    {
        // read spring config java class
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(ExerSportConfig.class);

        // get the bean from spring container
        Coach coach = context.getBean("wrestlingCoach", Coach.class);

        // call a method on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // close the context
        context.close();
    }
}
