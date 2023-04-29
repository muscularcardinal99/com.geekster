package com.geekster.UserManagementSystem2.Dao;

import com.geekster.UserManagementSystem2.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> userList =new ArrayList<>();
    public String save(User user) {
        userList.add(user);
        return "User : "+ user.getUserName() +" Added Successfully";
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public String deleteDatabase() {
        userList.clear();
        return "Data erased~!!!!!!";
    }

    public boolean updateUserById(String userId, User newData) {
        for(User x:userList){
            if(x.getUserId().equals(userId)){
                if(newData.getEmail()!=null){
                    x.setEmail(newData.getEmail());
                }
                if(newData.getPhoneNumber()!=null){
                    x.setPhoneNumber(newData.getPhoneNumber());
                }
                if(newData.getDateOfBirth()!=null){
                    x.setPhoneNumber(newData.getDateOfBirth());
                }
                if(newData.getUserName()!=null){
                    x.setUserName(newData.getUserName());
                }
                if(newData.getTime()!=null){
                    x.setTime(newData.getTime());
                }
                if(newData.getTime()!=null){
                    x.setTime(newData.getTime());
                }

            }
        }
        return true;
    }
}
