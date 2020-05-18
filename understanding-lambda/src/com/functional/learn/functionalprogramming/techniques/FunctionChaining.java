package com.functional.learn.functionalprogramming.techniques;

import java.util.function.Function;

public class FunctionChaining {

	// used to simplify code
	// each method returns an object, allowing methods to be chained together,
	// without storing values in variables

	public static void main(String[] args) {

		Consumer<String> c1 = s -> System.out.println(s);
		Consumer<String> c2 = s -> System.out.println(s);
		c1.accept("Hello");
		c2.accept("World");

		Consumer<String> c3 = s -> {
			c1.accept(s);
			c2.accept(s);
		};

		c3.accept("Hello");

		Consumer<String> c4 = c1.thenAccept(c2);
		c4.accept("Hello World!");
//		Consumer<String> c4 = c1.thenAccept(null);
		// NullPointerException is not thrown is because
		// the implementation was never executed, it gets executed only when we call
		// accept on c4
		// So, Objects.requireNonNull(next); ensures exception will be thrown

		Function<Integer, Integer> f1 = s -> s + 2;
		Function<Integer, Integer> f2 = s -> s * 2;
		Function<Integer, Integer> f3 = f1.andThen(f2);
		System.out.println(f3.apply(10));

		// The first function gets executed first.
		// The second function is executed on the result of the first function
	}

}
