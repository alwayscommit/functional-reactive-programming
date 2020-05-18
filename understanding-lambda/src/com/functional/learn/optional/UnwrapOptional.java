package com.functional.learn.optional;

import java.util.Optional;

public class UnwrapOptional {

	public static void main(String[] args) {
		Integer a = 10;
		Optional<Integer> optionalInt = Optional.of(a);

		Integer integerVal = optionalInt.get();

		System.out.println(integerVal);

		Optional<Integer> emptyOptional = Optional.empty();
		// emptyOptional.get();//java.util.NoSuchElementException: No value present
		// never use "get()" method if you're not completely sure of the value being
		// present
		// whole point of optionals is defeated if you use get without ensuring value is
		// actually present

		// isPresent
		Integer val = optionalInt.isPresent() ? optionalInt.get() : 0;
		System.out.println(val);

		Integer emptyVal = emptyOptional.isPresent() ? emptyOptional.get() : 0;
		System.out.println(emptyVal);

		// orElse

		Integer orElse = optionalInt.orElse(0);
		System.out.println(orElse);// returns 10 as the value is there

		Integer orElseEmpty = emptyOptional.orElse(0);
		System.out.println(orElseEmpty);// returns 0

		// orElseGet takes a supplier
		Integer orElseGet = emptyOptional.orElseGet(() -> 0);
		System.out.println(orElseGet);

		// orElse -> default object is created before checking whether required object
		// is empty or not.
		// orElseGet -> default object is created only if required object is empty
		// orElseGet -> better in terms of performance

		// orElseThrow(exception supplier extends IllegalArgumentException)
		emptyOptional.orElseThrow(() -> new IllegalArgumentException());
		
		//orElseThrow() overloaded version in Java 10, throws noSuchElementException if empty
		//like the get() method, get invites people to just call it without
		//noticing the risk of it being empty, so orElseThrow() is more explicit
		
		
	}

}
