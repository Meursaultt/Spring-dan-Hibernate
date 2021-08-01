package com.anggraan.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{
    // field injection otomatis dengan teknologi java reflection
    @Autowired
    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach()
    {
        System.out.println(">> TennisCoach inside default constructor");
    }

    /*
    @Autowired
    public TennisCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }
    */

/*    @Autowired
    public void setFortuneService(FortuneService fortuneService)
    {
        System.out.println(">> TennisCoach inside setFortuneService() method");
        this.fortuneService = fortuneService;
    }*/

/*
    @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService)
    {
        System.out.println(">> TennisCoach inside setFortuneService() method");
        this.fortuneService = fortuneService;
    }
*/

    @Override
    public String getDailyWorkout()
    {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}
