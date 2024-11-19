package com.example.SpringCoreDemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    public FootballCoach(){
        System.out.println("In construtor : "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Complete circles of the football ground for 5 times";
    }
}
