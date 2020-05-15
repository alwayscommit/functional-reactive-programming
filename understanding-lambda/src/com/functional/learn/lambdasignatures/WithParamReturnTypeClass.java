package com.functional.learn.lambdasignatures;

public class WithParamReturnTypeClass {

	public static void main(String[] args) {
		//Function as a variable
		LengthOfString strLen = (str) -> str.length();
		int length = strLen.length("Aakash");
		System.out.println(length);
	}

	/*
	 * public int length(String s) { return s.length(); }
	 * 
	 * (s) -> return s.length();
	 * 
	 * Compiler can guess the return keyword
	 * 
	 * (s) -> s.length();
	 */

}
