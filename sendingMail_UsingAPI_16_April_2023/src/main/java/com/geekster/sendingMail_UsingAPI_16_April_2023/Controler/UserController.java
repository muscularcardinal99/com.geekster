package com.geekster.sendingMail_UsingAPI_16_April_2023.Controler;

import com.geekster.sendingMail_UsingAPI_16_April_2023.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
    @Autowired
    static User defaultUser;

    @GetMapping("/User")
    public static User getUser(){return defaultUser; }
}
