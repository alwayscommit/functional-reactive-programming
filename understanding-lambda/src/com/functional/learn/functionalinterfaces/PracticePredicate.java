package com.functional.learn.functionalinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PracticePredicate {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("aakash");
		list.add("ranglani");
		list.add("");
		list.add("123");
		list.add("");
		list.add("aakash");
		System.out.println(list);
		Predicate<String> predicate = s -> !s.isEmpty();
		List<String> filteredList = filterList(list, predicate);
		System.out.println(filteredList);

		Predicate<String> predicateString = s -> s.contains("aakash");
		List<String> filteredList2 = filterList(list, predicateString);
		System.out.println(filteredList2);
		
		List<Integer> intList = Arrays.asList(1,2,3,4);
		Predicate<Integer> intPred = n -> n%2 == 0;
		List<Integer> filteredIntList1 = filterList(intList, intPred);
		System.out.println(filteredIntList1);
		
	}

	private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {

		List<T> filteredList = new ArrayList<T>();
		for (T s : list) {
			if (predicate.test(s)) {
				filteredList.add(s);
			}
		}

		return filteredList;
	}

}
