package com.functional.learn.functionalinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PracticeFunction {

	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("String","Hello","World","What's Happening?");
		Function<String, Integer> function = e -> e.length();
		System.out.println(strList);
		
		List<Integer> lengthList = map(strList, function);
		System.out.println(lengthList);
	}

	private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
		List<R> newList = new ArrayList<R>();
		for(T e : list) {
			newList.add(function.apply(e));
		}
		return newList;
	}
	
}
