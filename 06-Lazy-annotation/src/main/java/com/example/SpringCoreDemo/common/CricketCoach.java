package com.example.SpringCoreDemo.common;

import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In construtor : "+ getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practice bowling for 15 kms";
    }
}
