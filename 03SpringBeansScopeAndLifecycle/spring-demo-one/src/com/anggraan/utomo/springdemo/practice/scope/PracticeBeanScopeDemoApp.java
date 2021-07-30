package com.anggraan.utomo.springdemo.practice.scope;

import com.anggraan.utomo.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeBeanScopeDemoApp
{
    public static void main(String[] args)
    {
        // load spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScopeExercise-applicationContext.xml");

        // retrieve bean
        Coach theCoach = context.getBean("myGolfCoach", Coach.class);
        Coach alphaCoach = context.getBean("myGolfCoach", Coach.class);

        // check if same
        boolean result = (theCoach == alphaCoach);
        System.out.println("Pointing the same object " + result);
        System.out.println("Memory location of theCoach = " + theCoach);
        System.out.println("Memory location of alphaCoach = " + alphaCoach);
    }
}
