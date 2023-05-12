package com.jenkinstest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrinterTest {

	@Test
	void test() {
		new Printer().print("OK");
		assertTrue(true);
	}

}
