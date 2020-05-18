package com.functional.learn.functionalprogramming.techniques;

//Tail call recursion or optimization
public class TailCallOptimization {

	public static void main(String[] args) {

	}

	public static long reFact(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * reFact(n - 1);
		}
	}
	// Keeps holding the stack

	public static long tailReFact(int n, int accumulator) {
		if (n <= 1) {
			return accumulator;
		}
		return tailReFact(n - 1, n * accumulator);
	}
	// Accumulator stores the result, stack is freed

	// Tail Recursion => Pure Iteration
	// Non-tail Recursion != Pure Iteration

}
