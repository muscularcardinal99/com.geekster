package com.geekster.RandomJokes.Controller;
import com.geekster.RandomJokes.DAO.JokesRepo;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class JokesController {

    public static void main(String[] args) throws Exception {
        JokesRepo jokesRepo =new JokesRepo();
        jokesRepo.setJokeRepo(new ArrayList<>());


        URL getUrl = new URL("https://api.chucknorris.io/jokes/random");
        HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
        connection.setRequestMethod("GET");


        int responseCode = connection.getResponseCode();

        if (responseCode == 200) {


            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder jsonResponseData = new StringBuilder();
            String readLine = null;


            while ((readLine = in.readLine()) != null) {
                jsonResponseData.append(readLine);
            }

            in.close();
            JSONObject masterData = new JSONObject(jsonResponseData.toString());
//            System.out.println(masterData.get("value"));

            jokesRepo.getJokeRepo().add((String) masterData.get("value"));
            for(String s:jokesRepo.getJokeRepo()){
                System.out.println(s);
            }

        } else {
            System.out.println("This is not valid URL- " + responseCode);
        }

    }

}