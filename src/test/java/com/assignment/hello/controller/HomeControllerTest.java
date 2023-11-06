package com.assignment.hello.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HomeControllerTest {
	HomeController controller;

	@Before
	public void setup() {
		controller = new HomeController();
	}

	@Test
	public void greetTest() {
		assertEquals("Hello World!!", controller.getMessage());
	}

	@Test
	public void greetMessageTest() {
		String expected = "Hello Test!!";
		String actual = controller.getMessageWithName("Test");
		assertEquals(expected, actual);
	}
}
