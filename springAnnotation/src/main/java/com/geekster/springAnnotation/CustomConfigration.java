package com.geekster.springAnnotation;

import com.geekster.springAnnotation.contoroller.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration


public class CustomConfigration {

    @Bean("user")
    public User getUser(){
        System.out.println("spring call.... in Custom Config");
        return new User("Default user");
    }
    @Bean("user2")
    public User getUser1(){
        System.out.println("Spring call.. in config bean of User");
        return new User("Default User 2");
    }
}
