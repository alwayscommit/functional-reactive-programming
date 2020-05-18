package com.functional.learn.functionalprogramming;

public class ReferentialTransparency {

	public static void main(String[] args) {
		int result = add(2, multiply(2, 4));
		int result2 = add(2, 8);
		int result3 = add(2, multiply(2, multiply(2, 2)));
		System.out.println(result);
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int multiply(int a, int b) {
//		System.out.println("Sysout"); if you add this statement, the function loses its referntial transparency
		// as the output will vary depending on the number of times multiple is called
		return a * b;
	}
	
	//A pure function is always referentially transparent, but the reverse is not true
	//Simplifies unit testing

}
