package com.kherguner.crud;

import java.io.IOException;
import org.json.JSONException;
/**
 * 
 * @author korhan
 * @email korhanherguner@gmail.com
 *
 */
public class App {
	public static void main(String[] args) throws JSONException, IOException {
		System.out.println(
				"******************************Hello JSON Create Read Update Delete******************************");
		Create create = new Create();
		Read read = new Read();
		Update update = new Update();
		Delete delete = new Delete("car");
	}
}
