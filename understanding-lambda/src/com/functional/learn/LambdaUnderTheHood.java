package com.functional.learn;

public class LambdaUnderTheHood {

	public static void main(String[] args) {

		/*
		 * LearnFunctionalInterface fun = new LearnFunctionalInterface() {
		 * 
		 * @Override public void functionalMethod() {
		 * System.out.println("Implementation 1"); } }; // LambdaUnderTheHood$1.class
		 * 
		 * LearnFunctionalInterface fun2 = new LearnFunctionalInterface() {
		 * 
		 * @Override public void functionalMethod() {
		 * System.out.println("Implementation 2"); } }; // LambdaUnderTheHood$2.class
		 * 
		 * // Two class files get created for the anonymous inner classes // bulky jar
		 * files
		 * 
		 */

		LearnFunctionalInterface fun = () -> System.out.println("I am lightweight");
		// LambdaUnderTheHood$1.class, LambdaUnderTheHood$2.class disappear from bin
		// folder

		/*
		 * D:\IT\STS-workspace\UnderstandingLambda\bin\com\functionalprogramming\learn>
		 * javap -c LambdaUnderTheHood.class Compiled from "LambdaUnderTheHood.java"
		 * public class com.functionalprogramming.learn.LambdaUnderTheHood { public
		 * com.functionalprogramming.learn.LambdaUnderTheHood(); Code: 0: aload_0 1:
		 * invokespecial #8 // Method java/lang/Object."<init>":()V 4: return
		 * 
		 * public static void main(java.lang.String[]); Code: 0: invokedynamic #16, 0 //
		 * InvokeDynamic #0:functionalMethod:()Lcom/functionalprogramming/learn/
		 * LearnFunctionalInterface; 5: astore_1 6: return }
		 * 
		 * 
		 * 
		 */

//InvokeDynamic is a bytecode instruction that facilitates the implementation of dynamic languages through dynamic method invocation
//InvokeDynamic is a benefit for statically typed language like Java
		//functionalMethod implementation is not present at compile time, but at runtime using lambda
		//Lambdas: smart anonymous functions, Type Inference, InvokeDynamic Functionality
		//Optimize memory
	}

}
