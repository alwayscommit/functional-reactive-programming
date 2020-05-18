package com.functional.learn.optional;

import java.util.Optional;

public class DangersOfNull {
	// Most occurred exception NullPointerException
	// Need a lot of boilerplate code for null checks, get in the way of business logic
	// reduce readability
	// Optional inspired from Scala, Haskell, SE 8 onwards, java.util.Optional
	// has Methods to deal with null
	
	// Object present inside Optional can be missing

	public static void main(String[] args) {

		String val = "a string";
		Optional<String> optional = Optional.of(val);
		System.out.println(optional.get());
		//empty
		Optional<Integer> empty = Optional.empty();
		
		Optional<String> nullable = Optional.ofNullable(val);
		Optional<String> emptyOptional = Optional.ofNullable(null);

	}

	
	//Optionals are immutable, optionals are stored as new objects, they require 16 bytes.
	//Creating optionals everywhere will cost us in performance... do it only where it's needed
	//T value;
	//Optional<T> optional;
	//value is wrapped inside Optional.
}
