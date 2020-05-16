package com.functional.learn.functionalinterfaces;

public class FunctionalInterfaceIntroClass {

	// Predicate - test
	// Consume - take something, give nothing
	// Function - Take something, give something
	// Supplier - Take nothing, give something

	// java.util.function -> Predefined genericc functional interfaces, can be use
	// readily to write lambdas

	public static void main(String[] args) {
		
		FunctionalGenerics<String, String> fun = s -> s.substring(1, 5);
		System.out.println(fun.execute("Aakash"));
	
		FunctionalGenerics<String, Integer> fun1 = s -> s.length();
		System.out.println(fun1.execute("Aakash"));
	
	}

}
