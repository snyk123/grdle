package com.example.junitmavenexample;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatenationTest {
	 @Test
	    public void testConcat() {
		Concatenation myConcat = new Concatenation();
	        String result = myConcat.concat("Hllo", "World");
	        assertNotEquals("HelloWorld", result);
	    }
}
