package com.learnjava;

import java.util.concurrent.CompletableFuture;

public class AsyncProgram {

	static String name = "Sachin Hande";

	public static String makeNameUpperCase (String name) {
		return name.toUpperCase();
	}

	public static void main (String[] args) {
		String name = makeNameUpperCase("Sachin hande");
		System.out.println(name);
		if (name.contains("sachin")) {
			System.out.println("name is present");
		} else {
			System.out.println("not present");
		}
	}
}
