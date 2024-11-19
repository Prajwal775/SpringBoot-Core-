package com.example.SpringCoreDemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component


public class BasketBallCoach implements Coach{

    public BasketBallCoach(){
        System.out.println("In construtor : "+ getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practice dribbling for 15 minutes";
    }
}
