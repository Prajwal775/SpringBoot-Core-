package com.example.SpringCoreDemo.common;

import org.springframework.stereotype.Component;

@Component

public class BasketBallCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Practice dribbling for 15 minutes";
    }
}
