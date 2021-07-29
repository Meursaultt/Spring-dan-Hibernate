package com.anggraan.utomo.springdemo.practice.di;

import com.anggraan.utomo.springdemo.Coach;
import com.anggraan.utomo.springdemo.FortuneService;

public class VolleyCoach implements Coach
{
    private FortuneService fortuneService;

    public VolleyCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Practice service and passing ball for 3 hours";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}
