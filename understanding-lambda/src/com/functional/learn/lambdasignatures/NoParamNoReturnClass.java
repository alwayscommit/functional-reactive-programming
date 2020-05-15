package com.functional.learn.lambdasignatures;

public class NoParamNoReturnClass {

	// Lambda for Method with no parameters, no return type
	public void myName() {
		System.out.println("Hi, Aakash!");
	}

	/*
	 * Remove name public void () { System.out.println("Hi, Aakash!"); }
	 */

	/*
	 * Remove return type public () { System.out.println("Hi, Aakash!"); }
	 */

	/*
	 * Remove access modifier () { System.out.println("Hi, Aakash!"); }
	 */

	/*
	 * Add the arrow () -> { System.out.println("Hi, Aakash!"); }
	 */

	/*
	 * Remove curly braces for single statement () ->
	 * System.out.println("Hi, Aakash!");
	 * 
	 */

	public static void main(String[] args) {
		Name name = () -> System.out.println("Aakash");
		name.myName();
	}

}
