package com.geekster.sendingMail_UsingAPI_16_April_2023;

import jakarta.mail.Session;

import java.util.Properties;

public class HandelMail {

    void sendMail(){
        //System properties
        Properties properties = System.getProperties();


        //set Properties
        properties.put("mail.smtp.host",ConstantsForMail.HOST);
        properties.put("mail.smtp.port","465");
        properties.put("mail.smtp.ssl.enable","true");
        properties.put("mail.smtp.auth","true");

        //session
        Session mailSession = Session.getInstance(properties,new MailAuthenticator());

    }
}
