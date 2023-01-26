package com.blockwit.learn.ruslan;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;



public class App46 {

	public static void main (String args[]) throws IOException {


		URL url = new URL ("https://w3dna.net/api/sales/domains/price");

		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setRequestMethod("POST");

		con.setRequestProperty("Content-Type", "application/json; utf-8");
		con.setRequestProperty("Accept", "application/json");

		con.setDoOutput(true);


		//json
		

		String jsonInputString = "{\"domainNames\": [\"ruslan\"]}";


		try (OutputStream os = con.getOutputStream()) {
			byte[] input = jsonInputString.getBytes("utf-8");
			os.write(input, 0, input.length);

		}


		int code = con.getResponseCode();
		System.out.println(code);

		try(BufferedReader br = new BufferedReader (new InputStreamReader(con.getInputStream(), "utf-8"))){
			StringBuilder response = new StringBuilder();
			String responseLine = null;
			while ((responseLine = br.readLine()) != null) {
				response.append(responseLine.trim());
			}

			System.out.println(response.toString());

			String json = response.toString();








		}












	



	
	}






}




