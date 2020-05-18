package com.functional.learn.methconstrefer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {
	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,3,4);
		
		Consumer<Integer> consumer = System.out :: println; //Object :: instanceMethod
		consumer.accept(56);
		
		printElements(intList, consumer);
	}

	private static <T> void printElements(List<T> list, Consumer<T> consumer) {
		for(T t : list) {
			consumer.accept(t);
		}
	}
 
}
