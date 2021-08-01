package com.anggraan.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExerSportConfig
{
    // define bean for happy fortune service
    @Bean
    public FortuneService happyFortuneService()
    {
        return new HappyFortuneService();
    }

    // define bean for wresttling coach and inject dependency
    @Bean
    public Coach wrestlingCoach()
    {
        ExerWrestlingCoach exerWrestlingCoach =
                new ExerWrestlingCoach(happyFortuneService());
        return exerWrestlingCoach;
    }
}
