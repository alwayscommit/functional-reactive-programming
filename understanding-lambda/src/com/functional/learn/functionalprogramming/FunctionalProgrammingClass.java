package com.functional.learn.functionalprogramming;

/*
 * In functional programming, we have everything in the form of Pure Mathematical function
 * In imperative/object oriented programming, we play with object state, modify outer environment
 * Pure mathematical function = perform calculations on the provided data, declarative, makes use of expressions
 * this is based on Lambda Calculus, older than computers, 
 * 
 */
public class FunctionalProgrammingClass {

	// Functions as first class citizens
	/*
	 * int result = myFunc(int a); playing with objects, variables Function aFun =
	 * myFunction(Function fun); now functions can be passed around as any other
	 * value
	 */

	// Pure function & No Side Effects
	/*
	 * The output of a pure function depends only on its input parameters and its
	 * internal algorithm
	 * 
	 * A pure function has no side effects, doesn't interact with the outside world
	 * like file systems should be deterministic, input -> apply algo -> return
	 * 
	 * Clarity of thought, Easy to reason about, Safe to use in multi-threading
	 * environment as they never modify the state of the program
	 * 
	 * *Consumer is expected to operate via side-effects as it takes an argument but
	 * returns nothing
	 * 
	 */

	public int sumPureFunction(int a, int b) {
		return a + b;
	}

	private int value = 0;

	public int addImpureFunction(int nextValue) {
		this.value += nextValue;
		return this.value;
	}
	
	// Higher order functions
	/*
	 * They either take function as argument or return function or do both
	 * HigherOrderFunctions.class
	 * 
	 */
	
	// Referential Transparency
	/*
	 * Referential transparency is a property of a function, variable or expression
	 * whereby the expression can be replaced by its evaluated value without affecting
	 * the behaviour of the program
	 * 
	 * Tiger is bigger than a kite - not same
	 * New Delhi is bigger than a kite - same
	 * India's capital is bigger than a kite - same 
	 * 
	 * x = 7 + (2*4)
	 * x = 7 + (8)
	 * x = 7 + (2*2*2) 
	 * 
	 * 
	 * 
	 * 
	 */

}
