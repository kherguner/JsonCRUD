package com.kherguner.crud;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Read {
	File read;
	JSONObject jsonObject, jsonObject2;
	JSONArray jsonArray;
	String birthday, name, id, nationality, food1, food2, food3;
	boolean car, married;
	int age;

	public Read() throws JSONException, IOException {
		read = new File("crud.json");
		jsonObject = new JSONObject(FileUtils.readFileToString(read, "utf-8"));
		System.out.println("-----> Read Json File");
		readFile();
		System.out.println(toString());
	}

	private void readFile() {
		birthday = jsonObject.getString("birthday");
		car = jsonObject.has("car");
		name = jsonObject.getString("name");
		married = jsonObject.getBoolean("married");
		age = jsonObject.getInt("age");
		jsonArray = jsonObject.getJSONArray("favorite_foods");
		ArrayList<Object> list = (ArrayList<Object>) jsonArray.toList();
		food1 = list.get(0).toString();
		food2 = list.get(1).toString();
		food3 = list.get(2).toString();
		jsonObject2 = jsonObject.getJSONObject("passport");
		id = jsonObject2.getString("id");
		nationality = jsonObject2.getString("nationality");
	}

	@Override
	public String toString() {
		return "Read [birthday=" + birthday + ", name=" + name + ", id=" + id + ", nationality=" + nationality
				+ ", food1=" + food1 + ", food2=" + food2 + ", food3=" + food3 + ", car=" + car + ", married=" + married
				+ ", age=" + age + "]";
	}
}
