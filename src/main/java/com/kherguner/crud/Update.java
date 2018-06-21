package com.kherguner.crud;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Update {
	JSONObject jsonObject;
	JSONArray jsonArray;
	File read;
	PrintWriter pw;
	FileOperations file;
	public Update() throws JSONException, IOException {
		read = new File("crud.json");
		file = new FileOperations();
		jsonObject = new JSONObject(FileUtils.readFileToString(read, "utf-8"));
		System.out.println("-------> Update Json File");
		updateFunction();
	}

	private void updateFunction() throws FileNotFoundException {
		jsonArray = jsonObject.getJSONArray("favorite_foods");
		ArrayList<Object> list = (ArrayList<Object>) jsonArray.toList();
		jsonObject.remove("favorite_foods");
		jsonObject.put("favorite_foods", new String[] { "pizza", "bief" });
		file.writeToFile(jsonObject);
	}

}
