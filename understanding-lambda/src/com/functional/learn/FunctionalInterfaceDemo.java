package com.functional.learn;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
//		LearnFunctionalInterface fun = () -> System.out.println("hello functional ways!");
//		fun.functionalMethod();

		// analogous to a variable assignment
		Integer x = 100;
		// functions as variable assignments since java 8

		onTheFly(() -> System.out.println("Hello"));

	}

	public static void onTheFly(LearnFunctionalInterface fun) {
		fun.functionalMethod();
	}

}
