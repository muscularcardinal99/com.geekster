package com.jokes.ChuckNorrisJokes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpURLConnection;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class Jokes {
    public static void main(String[] args) throws Exception {
        URL getUrl = new URL("https://api.chucknorris.io/jokes/random");
        HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
        connection.setRequestMethod("GET");
       String a = getJokes();
    }
    @GetMapping(value = "/jokes")
    public static String getJokes(@RequestBody String RequestData){
        System.out.println(RequestData);
        return "close";

    }


}
