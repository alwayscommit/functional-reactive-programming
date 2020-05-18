package com.functional.learn.functionalprogramming.techniques;

import java.util.function.BinaryOperator;

public class CurryingClass {

	public static void main(String[] args) {

		//Together a and b
		BinaryOperator<Integer> biOp = (a, b) -> a+b;
		System.out.println(biOp.apply(1, 2));
		
		//Separate inputs a and b
		Function<Integer, Function<Integer, Integer>> fun1 = u -> {
			
			return v -> u + v;
			
		};
		
		Function<Integer, Integer> fun2 = fun1.apply(1);
		System.out.println(fun2.apply(2));
		
		Function<Integer, Function<Integer, Integer>> funCombined = u -> v -> u + v;
		System.out.println(funCombined.apply(1).apply(2));
		
		//Function takes one single argument but with this curried approach, we can send 2 arguments
		
		
	}

}
