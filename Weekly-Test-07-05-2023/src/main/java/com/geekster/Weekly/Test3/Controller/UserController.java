package com.geekster.Weekly.Test3.Controller;

import com.geekster.Weekly.Test3.Service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/shop")
public class UserController {
    @Autowired
    UserServices userServices;
}
