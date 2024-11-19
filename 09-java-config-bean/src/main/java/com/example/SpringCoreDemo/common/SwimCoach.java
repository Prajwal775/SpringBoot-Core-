package com.example.SpringCoreDemo.common;

public class SwimCoach implements Coach {


    public SwimCoach(){
        System.out.println("In constructor : "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000m as a workout and do 50 m more";
    }
}
