package com.chaitu.junit.practice;

public class HelloWorld {
	
	
	public int devide(int x, int y) {
		// the following is just an example
		int result = 0;
		if (x > 999) {
			throw new IllegalArgumentException("X should be less than 999");
		}
		else{
			result = x / y;
		}
		return result;
	}
	
	public int multiply(int x, int y) {
		// the following is just an example
		
		return x * y;
	}
}