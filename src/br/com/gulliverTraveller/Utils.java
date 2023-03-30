package br.com.gulliverTraveller;

import java.io.BufferedReader;
import java.io.IOException;

public class Utils {
	public static String convertJsonToString(BufferedReader buffereReader) throws IOException {
		String response, jsonToString = "";
		while ((response = buffereReader.readLine()) != null) {
			jsonToString += response;
		}
		return jsonToString;
	}
}
