package com.example.SpringCoreDemo.rest;

import com.example.SpringCoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

//    constructor injection using qualifier
    @Autowired
    public DemoController(
            @Qualifier("footballCoach") Coach theCoach,
            @Qualifier("footballCoach") Coach theAnotherCoach)
    {
        System.out.println("In construtor : "+ getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach=theAnotherCoach;
    }


    @GetMapping("/dailyworkout")
    public String getdailyworkout(){
        return myCoach.getDailyWorkout();
    }


    @GetMapping("/check")
    public String check()
    {
    return "comparing beans: myCoach==anotherCoach,"+ (myCoach==anotherCoach);
    }
}
