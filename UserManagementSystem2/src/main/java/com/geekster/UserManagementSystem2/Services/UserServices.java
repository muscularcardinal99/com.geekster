package com.geekster.UserManagementSystem2.Services;

import com.geekster.UserManagementSystem2.Dao.UserRepository;
import com.geekster.UserManagementSystem2.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    @Autowired
    UserRepository userRepository;
    public String addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUser() {
        return userRepository.getAllUsers();
    }

    public User getUserData(String userId) {
        List<User> users = getAllUser();
        for(User u:users){
            if(u.getUserId().equals(userId)){
                return u;
            }
        }
        return null;
    }

    public String purgeUserData() {
       return  userRepository.deleteDatabase();
    }

    public String updateUserInfo(String userId, User newData) {
        boolean updateStatus = userRepository.updateUserById(userId,newData);



        if(updateStatus){
            return "User : "+userId+" was Updated!!!!!!!!!!";
        }else{
            return "User : "+userId+" can not be found in data base!!!!!!!!!";
        }

    }
}
