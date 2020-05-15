package com.functional.learn.lambdasignatures;

public class MultipleStatementsClass {

	public static void main(String[] args) {
		LengthOfString lenStr = s -> {
			int l = s.length();
			System.out.println("Length of str is " + l);
			return l; //return statement needed
		};//braces needed

		lenStr.length("Aakash");
	}

	/*
	 * public int length(String s) { int l = s.length();
	 * System.out.println("Length of the String is " + l); return l; }
	 *
	 * 
	 * (s) -> { int l = s.length(); System.out.println("Length of the String is " +
	 * l); return l; } can't remove braces, multi-line body can't remove return as
	 * it is a multi-line function
	 *
	 *
	 * can remove parenthesis around the param
	 *
	 * s -> { int l = s.length(); System.out.println("Length of the String is " +
	 * l); return l; }
	 */

}
