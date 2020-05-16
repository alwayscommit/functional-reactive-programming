package com.functional.learn.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PracticeConsumer {
	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,3,4);
		
		Consumer<Integer> consumer = e -> System.out.println(e);
		consumer.accept(56);
		
		printElements(intList, consumer);
	}

	private static <T> void printElements(List<T> list, Consumer<T> consumer) {
		for(T t : list) {
			consumer.accept(t);
		}
	}

}
