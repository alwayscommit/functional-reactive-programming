package com.functional.learn.methconstrefer;

import java.util.function.Supplier;

public class MethodReference2 {

	public static void main(String[] args) {

		Supplier<String> stringSupplier = () -> new String("Go Corona Go!");
		System.out.println(stringSupplier.get());

		Supplier<Double> randomNum = Math::random;//Classname::staticMethodName
		System.out.println(randomNum.get());
	}

}
