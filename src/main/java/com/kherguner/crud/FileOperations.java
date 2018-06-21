package com.kherguner.crud;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.json.JSONObject;

public class FileOperations {
	String path;
	PrintWriter writer;

	public void writeToFile(JSONObject jsonObject) throws FileNotFoundException {
		System.out.println(jsonObject);
		writer = new PrintWriter("crud.json");
		writer.println(jsonObject.toString(4));
		writer.flush();
	}
}
