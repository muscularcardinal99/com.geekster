package com.geekster.Fetchingdatausingjava3;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@SpringBootApplication
public class FetchingDataUsingJava3Application {

	public static void main(String[] args)throws Exception {
		URL getURL = new URL("https://api.nationalize.io/?name=nathaniel");

		HttpURLConnection con = (HttpURLConnection) getURL.openConnection();
		con.setRequestMethod("GET");
		int resCode = con.getResponseCode();

		if(resCode==200){
			BufferedReader in= new BufferedReader(new InputStreamReader(con.getInputStream()));
			StringBuilder jsonObject =new StringBuilder();
			String readLine;


			while((readLine =in.readLine()) != null){
				jsonObject.append(readLine);
			}
			in.close();

			JSONObject apiData = new JSONObject(jsonObject.toString());


			System.out.print(apiData);
		}else{
			System.out.println("this is not a valid url : "+ resCode);
		}


	}

}
