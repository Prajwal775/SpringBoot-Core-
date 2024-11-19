package com.example.SpringCoreDemo.rest;

import com.example.SpringCoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
//
//    @Autowired
//    public void SetCoach(@Qualifier("basketBallCoach") Coach theCoach){
//        myCoach=theCoach;
//    }

//    constructor injection using qualifier
    @Autowired
    public DemoController(@Qualifier("footballCoach") Coach theCoach) {
        System.out.println("In construtor : "+ getClass().getSimpleName());
        myCoach = theCoach;
    }


    @GetMapping("/dailyworkout")
    public String getdailyworkout(){
        return myCoach.getDailyWorkout();
    }
}
