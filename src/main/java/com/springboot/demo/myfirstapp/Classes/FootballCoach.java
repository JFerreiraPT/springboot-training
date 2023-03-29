package com.springboot.demo.myfirstapp.Classes;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //This primary means that if multiple dependency injections were found this one will be use  as "default"
//Only one @Primary annotation can exists for multiple implementations
@Lazy //just initialize it when demanded
public class FootballCoach implements ICoach {
    @Override
    public String getDailyWorkout() {
        return "score 10 goals";
    }
}
