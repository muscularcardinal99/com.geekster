package com.geekster.sendingMail_UsingAPI_16_April_2023;

import com.geekster.sendingMail_UsingAPI_16_April_2023.Controler.UserController;
import jakarta.mail.Authenticator;
import jakarta.mail.PasswordAuthentication;
import org.springframework.stereotype.Component;

@Component
public class MailAuthenticator extends Authenticator {

    protected PasswordAuthentication getPasswordAuthentication(){
        User a = UserController.getUser();
        return new PasswordAuthentication(a.getSender(),a.getPassword());
    }


}

