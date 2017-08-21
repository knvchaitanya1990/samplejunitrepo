package com.chaitu.junit.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyClassTest   {


	MyClass myclassObj ;
	
	@Before
	public void setup(){
		myclassObj = new MyClass();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testException() throws IllegalArgumentException {
		myclassObj.devide(866, 4);
	}
	
	@Test
	public void testmultiply() {
		int expected = 4000;
		assertEquals(expected,myclassObj.multiply(1000, 4));

	}

}
