package com.functional.learn.functionalprogramming.techniques;

//A closure is a function that refers to free variables in its lexical context
public class Closure {

	public static void main(String[] args) {

		int val = 111;
//		val=2; can't use if changed : Local variable val defined in an enclosing scope must be final or effectively final

		Task lambda = () -> {
//			val=123; Local variable val defined in an enclosing scope must be final or effectively final
			System.out.println(val);
			System.out.println("Task completed");
		}; //This is a closure using free variable in it's lexical scope

		printValue(lambda);// val is also passed
	}

	private static void printValue(Task lambda) {
		lambda.doTask();
	}

}
