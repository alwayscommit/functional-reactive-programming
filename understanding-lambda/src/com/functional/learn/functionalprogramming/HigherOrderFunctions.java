package com.functional.learn.functionalprogramming;

public class HigherOrderFunctions {

	// Functions as arguments or returns function, or does both
	// In Java, takes one or more lambda as param, or returns, or does both
	public static void main(String[] args) {
		IFactory<Integer> createFactory = createFactory(()->Math.random()*100, r-> r.intValue());
		Integer product = createFactory.create();
		System.out.println(product);
	}

	public static <T, R> IFactory<R> createFactory(IProducer<T> producer, IConfigurator<T, R> configurator) {
		return () -> {
			T product = producer.produce();
			return configurator.configure(product);
		};
	}
}
