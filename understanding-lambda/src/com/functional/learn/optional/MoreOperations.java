package com.functional.learn.optional;

import java.util.Optional;

public class MoreOperations {

	public static void main(String[] args) {

		Optional<String> optional = Optional.of("Value");
		optional.ifPresent(System.out::println);
		optional.ifPresent(val -> System.out.println("this is a " + val));

//		optional.ifPresentOrElse method is present Java 9 onwards; not in Java 8
		// if empty, executes the else part.
		Optional.empty().ifPresent(System.out::print);//if empty, does nothing
		Optional.empty().ifPresentOrElse(System.out::print, () -> System.out.println("value is absent!"));

		// stream - returns a sequential stream containing the value present in the
		// option
		optional.stream().forEach(s -> System.out.println(s));
		Optional.empty().stream().forEach(s -> System.out.println(s));// doesn't print anything

		// or - If a value is present, returns an Optional describing the value,
		// otherwise returns an Optional produced by the supplying function.
		optional.or(() -> Optional.of("new value")).ifPresent(System.out::println);
		Optional.empty().or(() -> Optional.of("new value")).ifPresent(System.out::println);
//		Optional.empty().or(() -> null).ifPresent(System.out::println); should ensure supplier doesn't return null
		
		//equals - both should be optionals, both are empty or both values are equal
		System.out.println(optional.equals(Optional.of("Value")));
		
		//hashcode
		System.out.println(optional.hashCode());
		System.out.println(Optional.empty().hashCode());// returns 0
	
	}

}
