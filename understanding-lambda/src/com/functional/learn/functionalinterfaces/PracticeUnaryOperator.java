package com.functional.learn.functionalinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class PracticeUnaryOperator {

	// input type return type same
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(list);
		UnaryOperator<Integer> operator = i -> i * 100;
		List<Integer> multipliedList = map(list, operator);
		System.out.println(multipliedList);
	}

	private static <T> List<T> map(List<T> list, UnaryOperator<T> operator) {

		List<T> newList = new ArrayList<T>();
		for (T t : list) {
			T ele = operator.apply(t);// does not contain any abstract methods by itself, so we can use apply function
			// of the base Function Interface
			newList.add(ele);
		}

		return newList;
	}

}
