package com.springboot.demo.myfirstapp.rest;

import com.springboot.demo.myfirstapp.Classes.CricketCoach;
import com.springboot.demo.myfirstapp.Classes.FootballCoach;
import com.springboot.demo.myfirstapp.Classes.ICoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DependencyInjectionDemo {
    private CricketCoach myCoach;

    private FootballCoach futCoach;
    @Autowired
    public DependencyInjectionDemo(CricketCoach coach) {
        myCoach = coach;
    }

    //Inject via setter
    @Autowired
    public void setFutCoach(FootballCoach coach) {
        futCoach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return this.myCoach.getDailyWorkout();
    }

    //we can inject in methods too!!
    //we can specify which bean we want to inject, in the case Coach is
    //a super class for example @Qualifier("footballCoach")Coach coach
    // first letter is lower case
    @Autowired
    public String test(@Qualifier("footballCoach")ICoach coach) {
        return coach.getDailyWorkout();
    }
}


