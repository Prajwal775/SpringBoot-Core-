package com.example.SpringCoreDemo.rest;

import com.example.SpringCoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public void SetCoach(Coach theCoach){
        myCoach=theCoach;
    }

//    @Autowired -since we are providing the autowired annotation then spring would use this for dependency injection
//    public void dostuff(Coach theCoach){
//        myCoach=theCoach;
//    }


    @GetMapping("/dailyworkout")
    public String getdailyworkout(){
        return myCoach.getDailyWorkout();
    }
}
