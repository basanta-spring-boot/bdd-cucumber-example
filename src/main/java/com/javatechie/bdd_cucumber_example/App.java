package com.javatechie.bdd_cucumber_example;

/**
 * Hello world!
 *
 */
public class App {

	public String find(int number) {
		String response = "";
		if (number % 2 == 0) {
			response = "even";
		}
		if (number % 2 != 0) {
			response = "odd";
		}
		return response;
	}

}
