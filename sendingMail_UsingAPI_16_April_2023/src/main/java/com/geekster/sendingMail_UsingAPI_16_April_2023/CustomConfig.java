package com.geekster.sendingMail_UsingAPI_16_April_2023;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class CustomConfig {

    @Bean
    public User getUser(){
        System.out.println("Spring call...in CustomConfig of User");
        return new User(ConstantsForMail.SENDER,ConstantsForMail.PASSWORD);


    }
}
