package com.springboot.demo.myfirstapp.Classes;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements ICoach{
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }



}
