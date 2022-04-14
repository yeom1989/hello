package com.okdevtv.tdd.hello;

public class HelloWorld {

	public String getMessage() {
		//return getMessage("World");
		return "World";
	}

	public String getMessage(String name) {
		if(name == null) {
			name = "World";
		}
		return "Hello "+ name;
	}

}
