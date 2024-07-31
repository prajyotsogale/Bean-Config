package com.example.KnowTheBean.config;

import com.example.KnowTheBean.Coach;
import com.example.KnowTheBean.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
