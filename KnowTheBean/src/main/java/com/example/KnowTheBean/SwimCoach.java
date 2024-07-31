package com.example.KnowTheBean;

public class SwimCoach implements Coach{
    public SwimCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "Swim a 1000m as a warmup";
    }
}
