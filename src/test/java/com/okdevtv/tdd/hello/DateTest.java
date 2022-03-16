package com.okdevtv.tdd.hello;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DateTest {

	@Test
<<<<<<< HEAD
	public void testDate() {
		Date date = new Date();
		Class<? extends Date> class1 = date.getClass();
		String name = class1.getName();
		assertEquals("java.util.Date", name);
=======
	public void test() {
		Date date = new Date();
		Class<? extends Date> class1 = date.getClass();
		String name = class1.getName();
		assertEquals("", name);
>>>>>>> 8be435a29f7131a0bd51e5c1817122826dca8770
	}

}
