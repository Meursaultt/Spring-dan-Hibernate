package com.anggraan.utomo.springdemo.practice;

import com.anggraan.utomo.springdemo.Coach;

public class FootballCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "Kick the ball 200 times";
    }

    @Override
    public String getDailyFortune()
    {
        return null;
    }
}
