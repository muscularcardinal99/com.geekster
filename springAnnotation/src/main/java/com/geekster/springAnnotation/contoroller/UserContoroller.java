package com.geekster.springAnnotation.contoroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContoroller {

    @Autowired
    @Qualifier("user2")
    User a;

    @GetMapping("/user" )
        public User getUser(){
            return a;
        }

}
