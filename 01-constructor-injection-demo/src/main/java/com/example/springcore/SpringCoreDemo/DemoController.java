package com.example.springcore.SpringCoreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired

    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }




    @GetMapping("/dailyworkout")
    public String getdailyworkout(){
        return myCoach.getDailyWorkout();
    }
}
