package com.okdevtv.tdd.hello;

import java.text.NumberFormat;

public class StringUtils {
	
	StringUtils() {
	    throw new IllegalStateException("Utility class");
	}
	
	public static String comma(int number) {
		NumberFormat numberFormat = NumberFormat.getInstance();
		return numberFormat.format(number);
	}
	
}
