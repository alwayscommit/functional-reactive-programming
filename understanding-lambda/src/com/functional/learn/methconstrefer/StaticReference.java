package com.functional.learn.methconstrefer;

import java.util.function.BiFunction;

public class StaticReference {

	public static void main(String[] args) {
		BiFunction<String, String, String> biFun = A_Class::staticMethod;// Class :: staticMethod
		System.out.println(biFun.apply("Aakash", "Ranglani"));
	}

}

class A_Class {
	static String staticMethod(String a, String b) {
		return a + " " + b;
	}
}
