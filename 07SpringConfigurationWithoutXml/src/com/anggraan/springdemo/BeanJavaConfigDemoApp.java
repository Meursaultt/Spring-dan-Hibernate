package com.anggraan.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanJavaConfigDemoApp
{
    public static void main(String[] args)
    {
        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

        // call a method on the bean
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getTeam());
        System.out.println(coach.getEmail());

        // close the context
        context.close();
    }
}
