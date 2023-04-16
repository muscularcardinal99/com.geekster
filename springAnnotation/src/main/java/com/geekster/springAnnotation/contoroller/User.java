package com.geekster.springAnnotation.contoroller;

public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {

        System.out.println("Student called from Spring framework-1");
    }

    public User(String name) {


        this.name = name;

        System.out.println("Student called from Spring framework-2 : "  + this.name);
    }
}
