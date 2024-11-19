package com.example.SpringCoreDemo.common;

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
