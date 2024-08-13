package com.learnjava.freemarker.model;

public class Product {
	private String name;
	private String url;

	public Product(String name, String url) {
		this.name = name;
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}
}
