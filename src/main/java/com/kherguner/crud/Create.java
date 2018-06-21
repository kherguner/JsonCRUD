package com.kherguner.crud;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.json.JSONObject;

public class Create {
	PrintWriter pw;
	JSONObject jsonObject, jsonObject2;
	FileOperations file;

	public Create() throws FileNotFoundException {
		file = new FileOperations();
		jsonObject = new JSONObject();
		jsonObject2 = new JSONObject();
		System.out.println("---> Create Json File");
		createJson();

	}

	private void createJson() throws FileNotFoundException {
		jsonObject.put("name", "Korhan");
		jsonObject.put("birthday", "05-08-1988");
		jsonObject.put("age", 29);
		jsonObject.put("married", Boolean.FALSE);
		jsonObject.put("car", JSONObject.NULL);
		jsonObject.put("favorite_foods", new String[] { "cookie", "fish", "chips" });
		jsonObject2.put("id", "9999");
		jsonObject2.put("nationality", "Turkey");
		jsonObject.put("passport", jsonObject2);
		file.writeToFile(jsonObject);
	}

}
