package com.geekster.Weekly.Test3.Service;

import com.geekster.Weekly.Test3.DAO.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    IUserRepo userRepo;
}
