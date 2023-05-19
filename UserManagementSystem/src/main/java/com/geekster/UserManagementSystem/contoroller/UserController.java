package com.geekster.UserManagementSystem.contoroller;

import com.geekster.UserManagementSystem.model.User;
import com.geekster.UserManagementSystem.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserServices userServices;
    @GetMapping(value = "/getAllUser")
    public List<User> getAllUser(){
        return userServices.getAllUsers();
    }
    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody User user){
        return userServices.addUserData(user);
    }
    @GetMapping(value = "/getUser/{userID}")
    public User getUserByUserId(@PathVariable String userID){
        //return type String
        return userServices.getUserById(userID);
    }
    @DeleteMapping(value = "/deleteAllUser")
    public String deleteAllUser(){
        return userServices.deleteAllUser();
    }
    @DeleteMapping(value = "/deleteUser/{userID}")
        public String deleteSingleUserByUserId(@PathVariable String userID){
            return userServices.deleteUserById(userID);
        }
    @PostMapping(value = "/updateUserInfo/{userID}/{newNumber}")
    public String updateUserPhoneNumberById(@PathVariable String userID,@PathVariable String newNumber){
        return userServices.updateUserByID(userID,newNumber);
    }





}
