package com.anggraan.springdemo;

public class SwimCoach implements Coach
{
    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Swim 500 meters as warm up";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}
