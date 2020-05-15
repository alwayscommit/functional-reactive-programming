package com.functional.learn;

import java.util.stream.IntStream;

public class ProgrammingStyleClass {

	/*
	 * Imperative vs Declarative vs Functional Programming
	 * 
	 * Lambda enables passing of behaviour as parameter, declarative programming
	 * (what to do, instead of how to do)
	 * 
	 * 
	 * Functional programming is a subset of declarative programming, like SQL we
	 * just use expressions, not statements
	 */

	public static void main(String[] args) {

		// Imperative - How to do?
		int sumOfEvens = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sumOfEvens = sumOfEvens + i;
			}
		}
		System.out.println(sumOfEvens);

		// Declarative or Functional - What to do?
		sumOfEvens = IntStream.rangeClosed(0, 100).filter(i -> i % 2 == 0).reduce((x, y) -> x + y).getAsInt();
		System.out.println(sumOfEvens);
		//Thread safe

	}
}
