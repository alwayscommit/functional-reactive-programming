package com.functional.learn.functionalinterfaces;

import java.util.function.BiFunction;

public class PracticeBiFunction {

	public static void main(String[] args) {

		// has two input, one output

		BiFunction<String, String, String> biFun = (a, b) -> a + " " + b;
		String finalString = biFun.apply("Aakash", "Ranglani");
		System.out.println(finalString);

		BiFunction<String, String, Integer> biFun2 = (a, b) -> (a + b).length();
		Integer length = biFun2.apply("Aakash", "Ranglani");
		System.out.println(length);
	}

}
