package com.geekster.sendingMail_UsingAPI_16_April_2023;

import com.geekster.sendingMail_UsingAPI_16_April_2023.Controler.UserController;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

import java.util.Properties;

public class HandelMail {

    void sendMail(){
        // smpt gmailhost
        String host = ConstantsForMail.HOST;
        //System properties
        Properties properties = System.getProperties();


        //set Properties
        properties.put("mail.smtp.host",host);
        properties.put("mail.smtp.port","465");
        properties.put("mail.smtp.ssl.enable","true");
        properties.put("mail.smtp.auth","true");

        //session
        Session mailSession = Session.getInstance(properties,new MailAuthenticator());
        //Create the message Object

        MimeMessage mineMessage = new MimeMessage(mailSession);
        try {
            // sender
//            mineMessage.setFrom(UserController.getUser().getSender());
            mineMessage.setFrom(ConstantsForMail.SENDER);
            //recever
            mineMessage.setRecipients(Message.RecipientType.TO, String.valueOf(new InternetAddress(ConstantsForMail.RECEIVER)));
            //Subject
            mineMessage.setSubject(ConstantsForMail.SUBJECT);
            //Body of Mail
            mineMessage.setText(ConstantsForMail.BODY);

            // Sending mail using HOST

            Transport.send(mineMessage);

        }  catch (MessagingException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
