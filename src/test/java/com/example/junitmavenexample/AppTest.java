package com.example.junitmavenexample;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	 @Test
    public void addTest1(){
		App a1=new App();
		int result=a1.add(10, 20);
		assertEquals(30,result);
	}
}
