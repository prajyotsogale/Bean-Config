package com.example.KnowTheBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "In the Badminton";
    }
    public BadmintonCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }
}
