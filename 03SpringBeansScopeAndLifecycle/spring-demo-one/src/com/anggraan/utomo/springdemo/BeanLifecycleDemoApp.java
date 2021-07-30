package com.anggraan.utomo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp
{
    public static void main(String[] args)
    {
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve beans from the container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
