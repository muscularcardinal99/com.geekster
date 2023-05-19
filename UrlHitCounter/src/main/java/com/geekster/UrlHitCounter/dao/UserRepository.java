package com.geekster.UrlHitCounter.dao;

import com.geekster.UrlHitCounter.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> userData =new ArrayList<>();

    public User getUserData(String yourusername) {
        for(User user:userData){
            if(user.getUserName().equals(yourusername)){
                return user;
            }
        }
        return null;
    }

    public String addUser(User user) {
        userData.add(user);
        return user.getUserName()+" : successfully registered to the database";
    }

    public void addHitOfUser(String yourusername) {
        for(User user :userData ){
            int x=1;
            if (user.getUserName().equals(yourusername)){
                x +=user.getHitCount();
                user.setHitCount(x);
            }
        }
    }
}
