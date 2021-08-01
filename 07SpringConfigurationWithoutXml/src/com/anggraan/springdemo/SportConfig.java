package com.anggraan.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// note file harus diluar folder package atau letak di src saja
@PropertySource("coach.properties")
public class SportConfig
{
    // define bean for our sad fortune
    public FortuneService sadFortuneService()
    {
        return new SadFortuneService();
    }

    // define bean for our swim coach and inject dependency
    @Bean
    public Coach swimCoach()
    {
        return new SwimCoach(sadFortuneService());
    }
}
