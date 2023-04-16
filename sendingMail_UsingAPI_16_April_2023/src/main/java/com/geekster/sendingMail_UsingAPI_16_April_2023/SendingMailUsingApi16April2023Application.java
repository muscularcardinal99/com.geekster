package com.geekster.sendingMail_UsingAPI_16_April_2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SendingMailUsingApi16April2023Application {

	public static void main(String[] args) {

		System.out.println("This application will now send mail using API");
		HandelMail mail = new HandelMail();
		mail.sendMail();
	}

}
