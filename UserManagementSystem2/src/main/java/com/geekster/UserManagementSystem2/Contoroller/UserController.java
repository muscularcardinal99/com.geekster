package com.geekster.UserManagementSystem2.Contoroller;

import com.geekster.UserManagementSystem2.Model.User;
import com.geekster.UserManagementSystem2.Services.UserServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserServices userServices;
    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody @Valid User user){
        return this.userServices.addUser(user);
    }
    @GetMapping(value = "/getAllUser")
    public List<User> getAllUser(){
        return this.userServices.getAllUser();
    }
    @GetMapping(value = "/getUser/{userid}")
    public User getUser(@PathVariable String userId){
        return this.userServices.getUserData(userId);
    }

    @DeleteMapping(value = "/deleteUser")
    public String deleteUser(){
       return userServices.purgeUserData();
    }
    @PostMapping(value = "/updateUserInfo/{userId}")
    public String updateUserDataById(@PathVariable String userId, @RequestBody User newData){
        return userServices.updateUserInfo(userId,newData);
    }


}
