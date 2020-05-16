package com.functional.learn.lambda;

public class LambdaExample1 {

	// Ways to achieve multi-threading, Runnable Interface and extending Thread
	// Class
	public static void main(String[] args) {
		// Lengthy code just to execute one single thread.
		FirstRunnable runnable = new FirstRunnable();
		Thread t1 = new Thread(runnable);
		t1.start();

		// Anonymous Inner Class, More concise than the previous way.
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread Executed!");
			}

		});
		t.start();

		// Lambda is more concise than Anonymous Class approach

		// Parts of a function
		/* Properties, Name of the function, body of the function, return type */

		// Deriving Lambda
		/*
		 * 1. new Runnable() {
		 * 
		 * @Override public void run() { System.out.println("Thread Executed!"); }
		 * 
		 * } Anonymous Inner class
		 * 
		 * Remove new Runnable() first as the compiler already knows Thread class
		 * accepts Runnable
		 * 
		 * 2. We're left with public void run() {
		 * System.out.println("Thread Executed!"); }
		 * 
		 * run() compiler knows this method is the only one inside Runnable public
		 * access modifier is also not needed as interface methods declaration should be
		 * public return type, compiler can guess by using TypeInference*
		 * 
		 * So we're left with
		 * 
		 * () -> { System.out.println("Thread Executed!"); }
		 * 
		 * 
		 * This is first cute lambda
		 */

		Thread lambdaThread = new Thread(() -> {
			System.out.println("Lambda Thread Executed!");
		});
		lambdaThread.start();

		// We can only convert lambdas for the interfaces that have only one abstract
		// method

	}

}
