package com.geekster.SimpleApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController

public class CatController {

    @GetMapping( value = "/cat")

    public String getCatInfo() {
        String msg ="This is Info CatController";

        return msg;
    }

    @PostMapping(value = "/cat")
    public String SaveCat(@RequestBody String requestData){
        System.out.println(requestData);
        return ("POST" + requestData);

    }

    @DeleteMapping(value = "/cat")
    public String deleteCat(){
        return "delete";

    }

    @PutMapping(value = "/cat")
    public String UpdateCat(){

        return "PUT \n put";
    }
}
