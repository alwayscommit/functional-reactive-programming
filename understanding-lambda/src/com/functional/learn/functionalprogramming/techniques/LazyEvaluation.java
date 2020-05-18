package com.functional.learn.functionalprogramming.techniques;

public class LazyEvaluation {

	public static void main(String[] args) {
		// Delays the evaluation of an expression until it is needed

		Function<Integer, Integer> function = i -> i + 10;
		// code
		// code
		// code
		// code
		// code
		// code
		// code
		if(true) {
			Integer val = function.apply(20);
			System.out.println(val);
		} else {
//			something else;
		}
		//Lazy 
		
		//Lazy initialization
//		() -> new Person("aakash",23);
	}
}
