package com.functional.learn.methconstrefer;

import java.util.function.Function;

public class ConstructorReference {

	public static void main(String[] args) {

//		Function<Runnable, Thread> threadGenerator1 = r -> new Thread(r); ctrl+1
		Function<Runnable, Thread> threadGenerator = Thread::new;// Constructor reference

		Runnable task1 = () -> System.out.println("Task 1 executed");
		Runnable task2 = () -> System.out.println("Task 2 executed");

		Thread thread1 = threadGenerator.apply(task1);
		Thread thread2 = threadGenerator.apply(task2);
		
		thread1.start();
		thread2.start();

		threadGenerator.apply(()->System.out.println("Task 3 execute")).start();;
	}

}
