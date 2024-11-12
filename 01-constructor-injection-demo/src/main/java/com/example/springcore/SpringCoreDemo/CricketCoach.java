package com.example.springcore.SpringCoreDemo;

import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Practice running for 5 kms and another 20 minutes";
    }
}
