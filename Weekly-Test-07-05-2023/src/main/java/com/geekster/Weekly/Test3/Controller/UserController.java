package com.geekster.Weekly.Test3.Controller;

import com.geekster.Weekly.Test3.Model.User;
import com.geekster.Weekly.Test3.Service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/shop")
public class UserController {
    @Autowired
    UserServices userServices;

    @PostMapping("adduser")
    public String addUser(@RequestBody User user){
        return  userServices.addUser(user);
    }
    @GetMapping("getUser")
    public User getUser(@PathVariable Integer userId ){
        return userServices.getUser(userId);
    }
}
