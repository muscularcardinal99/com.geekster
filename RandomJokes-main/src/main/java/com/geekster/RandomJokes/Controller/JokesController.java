package com.geekster.RandomJokes.Controller;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class JokesController {

    public static void main(String[] args) throws Exception {

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
            System.out.println(masterData.get("value"));
//            System.out.println("Current elevation " + masterData.get("elevation"));
//            System.out.println("Current generationtime_ms " + masterData.get("generationtime_ms"));

//            JSONObject currentWeatherObj = (JSONObject) masterData.get("current_weather");
//
//            System.out.println("Current temperature " + currentWeatherObj.get("temperature"));
//            System.out.println("Current windspeed " + currentWeatherObj.get("windspeed"));
        } else {
            System.out.println("This is not valid URL- " + responseCode);
        }

    }

}