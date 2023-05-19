package com.geekster.UrlHitCounter.controller;

import com.geekster.UrlHitCounter.model.User;
import com.geekster.UrlHitCounter.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UserController {
    @Autowired
    UserServices userServices;

    @GetMapping(value = "/username/{yourusername}/hit")
    public void addHitCount(@PathVariable String yourusername){
        userServices.addHitofUser(yourusername);
    }

    @GetMapping( value = "/username/{yourusername}/count")
    public User getHitCount(@PathVariable String yourusername){

        return userServices.getHitCount(yourusername);
    }
    @PostMapping(value = "/addUserList")
    public String addUserList(@RequestBody List<User> userArray){
       List<String> userStatus = userServices.addUserList(userArray);
       String msg="";
        for (String x:userStatus) {
            msg = msg +x+"\n";
        }
        return msg;
    }
}
