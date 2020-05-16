package com.functional.learn.functionalinterfaces;

import java.util.function.Supplier;

public class PracticeSupplier {
	
	public static void main(String[] args) {
		
		Supplier<String> stringSupplier = () -> new String("Go Corona Go!");
		System.out.println(stringSupplier.get());
		
		Supplier<Double> randomNum = () -> Math.random();
		System.out.println(randomNum.get());
	}

}
