package com.anggraan.utomo.springdemo;

public class MyApp
{
    public static void main(String[] args)
    {
        FortuneService fortuneService = new HappyFortuneService();
        Coach theCoach = new TrackCoach(fortuneService);
        System.out.println(theCoach.getDailyWorkout());
    }
}
