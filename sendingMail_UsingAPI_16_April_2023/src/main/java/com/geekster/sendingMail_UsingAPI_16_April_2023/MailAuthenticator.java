package com.geekster.sendingMail_UsingAPI_16_April_2023;

import com.geekster.sendingMail_UsingAPI_16_April_2023.Controler.UserController;

import org.springframework.stereotype.Component;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

@Component
public class MailAuthenticator extends Authenticator {

    protected PasswordAuthentication getPasswordAuthentication(){

        return new PasswordAuthentication(ConstantsForMail.SENDER,ConstantsForMail.PASSWORD);
    }


}

