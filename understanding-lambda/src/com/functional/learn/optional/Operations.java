package com.functional.learn.optional;

import java.util.Optional;

public class Operations {
	
	public static void main(String[] args) {
		
		//map()
		//filter()
		//flatMap
		
		Optional<String> optional = Optional.of("Value");
		//map - transforms or maps the value into another option acc to ]
		//given function
		
		Optional<String> optionalMap = optional.map(val -> "Replaced");
		System.out.println(optionalMap.orElse("empty!"));
		
		//filter
		Optional<String> optionalFilter = optional.filter(val -> val.equalsIgnoreCase("Value"));
		System.out.println(optionalFilter.orElse(""));
		
		//flatMap - it is an operation like map but it's result is already an optional
		Optional<String> optionalFlatMap = optional.flatMap(val -> Optional.of("Replaced by Flatmap!"));
		System.out.println(optionalFlatMap.get());
		
	}

}
