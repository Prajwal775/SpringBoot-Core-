package com.example.SpringCoreDemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary//we can use primary annotation to a class to have higher priority
//but if we are using primary and we still use qualifier anootation the qualifier will have the higher priority
//also there can only be one Primary class


public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Complete circles of the football ground for 5 times";
    }
}
