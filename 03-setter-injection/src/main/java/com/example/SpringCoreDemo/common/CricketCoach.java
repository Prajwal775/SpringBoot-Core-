package com.example.SpringCoreDemo.common;

import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Practice running for 5 kms and do some pushups and some lunges";
    }
}
