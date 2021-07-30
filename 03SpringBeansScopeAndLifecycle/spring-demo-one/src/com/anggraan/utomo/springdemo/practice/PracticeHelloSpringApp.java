package com.anggraan.utomo.springdemo.practice;

import com.anggraan.utomo.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp
{
    public static void main(String[] args)
    {
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("footballCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
