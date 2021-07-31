package com.anggraan.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ExerFootballCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "Kick the ball 500 times";
    }
}
