package com.functional.learn;

@FunctionalInterface // Just to ensure it is functional, no one adds more methods to it
public interface LearnFunctionalInterface {

	// Can only have one single abstract method
	public abstract void functionalMethod();

	// Compilation error if you put more than one method
	// Invalid '@FunctionalInterface' annotation; LearnFunctionalInterface is not a
	// functional interface

//	public abstract void functionalMet2hod();
	
	//Single method is needed to make lambdas run
}
