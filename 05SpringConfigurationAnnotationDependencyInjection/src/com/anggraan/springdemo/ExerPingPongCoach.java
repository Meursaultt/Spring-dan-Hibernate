package com.anggraan.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ExerPingPongCoach implements Coach
{
    @Autowired
    @Qualifier("exerFileFortuneService")
    private FortuneService fortuneService;

    public ExerPingPongCoach()
    {
        System.out.println(">> inside default constructor");
    }

    @Override
    public String getDailyWorkout()
    {
        return "Practice pnig pong service";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}
