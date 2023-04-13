package com.geekster.Fetching.data.Using.java2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.configurationprocessor.json.JSONObject;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;


@SpringBootApplication
public class FetchingDataUsingJava2Application {

	public static void main(String[] args) {

		try {
			URL getUrl = new URL("https://api.zippopotam.us/us/33162");

			HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
			connection.setRequestMethod("GET");

			int responseCode = connection.getResponseCode();

			if (responseCode == 200) {
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				StringBuilder JsonObject = new StringBuilder();
				String readLine;


				while((readLine=in.readLine()) != null){
					JsonObject.append(readLine);
				}
				in.close();

				JSONObject zippopotam = new JSONObject(JsonObject.toString());
				System.out.println(zippopotam);

			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

}
