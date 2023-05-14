package com.geekster.Weekly.Test3.Service;

import com.geekster.Weekly.Test3.DAO.IUserRepo;
import com.geekster.Weekly.Test3.Model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class UserServices {
    @Autowired
    IUserRepo userRepo;

    public String addUser(User user) {

        userRepo.save(user);
        return "user data added sucessfully!!!!!!!";

    }

    public User getUser(Integer userId) {
        if(userRepo.existsById(userId))
            return userRepo.getById(userId);
        else{
            return null;
        }

    }
}
