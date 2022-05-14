package com.social.BuenoMorsels.Utilities;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class PexelsApi {

	public static String RandomImage(String type) {// arg = search image type query

		int responsecode = 0;
		try {
			double y =  (Math.random() * 10);
				String page = "next_page="+ Double.toString(y);
			URL url = new URL("https://api.pexels.com/v1/search?query="+ type + "&"+ page + "&per_page=80");// 80 per page is max

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			conn.setRequestMethod("GET");// hard coded my api key for now
			conn.setRequestProperty("Authorization", "563492ad6f91700001000001d34edb5085e84165bdcbb35d053510ca");
			conn.connect();

			// Getting the response code
			responsecode = conn.getResponseCode();
			
			// System.out.print(responsecode);

			if (responsecode != 200) {
				throw new RuntimeException("HttpResponseCode: " + responsecode);
			} else {

				String inline = "";
				String sb = "";

				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));

				while ((inline = br.readLine()) != null) {
					sb += (inline + "\n");
				}
				br.close();

				// Using the JSON simple library parse the string into a json object
				JSONParser parse = new JSONParser();
				JSONObject data_obj = (JSONObject) parse.parse(sb);

				// Get the required object from the above created object
				JSONArray obj = (JSONArray) data_obj.get("photos");
				String[] ranImage = new String[obj.size()];
				
				for (int i = 0; i < obj.size(); i++) {

					// takes the JSONArray and writes to JSONObject the to string array
					JSONObject new_obj = (JSONObject) obj.get(i);
					ranImage[i] = (String) new_obj.get("url");
				}
			//	returns random image from page
				int x = (int) (Math.random() * 100);
				if ( x <= obj.size() && x > 0) return ranImage[x];
				else return ranImage[x - 20];
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "no response or exceded daily calls(429)\n"
				+ "(limits = 200 per hour 20,000 per month )\n "
				+ "response received = "+ responsecode;

	}
}
