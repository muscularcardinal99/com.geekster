package com.geekster.sendingMail_UsingAPI_16_April_2023;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class User {
    private @Getter String sender;

    private @Getter String password;

    public User(String name , String password){
        this.sender = name;
        this.password=password;
    }


}
