package br.com.gulliverTraveller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.*;

public class CEPService {
	static String webService = "http://viacep.com.br/ws/";
	static int sucessCode = 200;

	public static Address findByCEP(String cep) throws Exception {
		String requestURL = webService + cep + "/json";

		try {
			URL url = new URL(requestURL);
			HttpURLConnection conection = (HttpURLConnection) url.openConnection();

			if (conection.getResponseCode() != sucessCode)
				throw new RuntimeException("HTTP error code : " + conection.getResponseCode());

			BufferedReader response = new BufferedReader(new InputStreamReader((conection.getInputStream())));
			String jsonToString = Utils.convertJsonToString(response);

			Gson gson = new Gson();

			Address address = gson.fromJson(jsonToString, Address.class);

			return address;
		} catch (Exception e) {
			throw new Exception("ERRO: " + e);
		}
	}
}