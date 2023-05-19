package com.geekster.UrlHitCounter.service;

import com.geekster.UrlHitCounter.dao.UserRepository;
import com.geekster.UrlHitCounter.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServices {
    @Autowired
    UserRepository userRepository;
    public User getHitCount(String yourusername){
       return userRepository.getUserData(yourusername);
    }

    public List<String> addUserList(List<User> userArray) {
//        int n= userArray.size();
        List<String> userRecord = new ArrayList<>();
        for(User user:userArray){
            String s = userRepository.addUser(user);
            userRecord.add(s);
        }
        return userRecord;
    }

    public void addHitofUser(String yourusername) {
        userRepository.addHitOfUser(yourusername);
    }
}
