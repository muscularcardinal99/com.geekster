package com.geekster.SimpleApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping(value = "/Student")
    public String getStudent(){
        return "This is Student";
    }
}
