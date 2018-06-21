package com.kherguner.crud;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class Delete {
	File read;
	PrintWriter pw;
	String name;
	JSONObject jsonObject;
	FileOperations file;
	public Delete(String name) throws JSONException, IOException {
		read = new File("crud.json");
		file = new FileOperations();
		this.name = name;
		jsonObject = new JSONObject(FileUtils.readFileToString(read, "utf-8"));
		System.out.println("---------> Delete Json File");
		removeFunction();

	}

	private void removeFunction() throws FileNotFoundException {
		jsonObject.remove(name);
		file.writeToFile(jsonObject);
	}

}
