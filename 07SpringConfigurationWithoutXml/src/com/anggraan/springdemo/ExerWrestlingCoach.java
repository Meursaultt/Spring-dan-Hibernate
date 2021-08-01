package com.anggraan.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ExerWrestlingCoach implements Coach
{
    private FortuneService fortuneService;

    public ExerWrestlingCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Practice until enemy take down";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}
