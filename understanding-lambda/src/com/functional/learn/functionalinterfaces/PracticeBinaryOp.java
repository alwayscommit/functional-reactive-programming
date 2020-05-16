package com.functional.learn.functionalinterfaces;

import java.util.function.BinaryOperator;

public class PracticeBinaryOp {
	
	//BinaryOperator<T> extends BiFunction<T,T,T> input T,T return T
	public static void main(String[] args) {
		
		BinaryOperator<String> operator = (a, b) -> a + "." + b;
		String newString = operator.apply("Aakash", "Ranglani");
		System.out.println(newString);
		
	}
	

}
