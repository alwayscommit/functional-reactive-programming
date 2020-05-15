package com.functional.learn.lambdasignatures;

public class WithParamNoReturn {

	public static void main(String[] args) {
		MathOperation add = (a, b) -> System.out.println(a + b);
		add.operation(1, 2);
		
		MathOperation multiply = (a, b) -> System.out.println(a * b);
		multiply.operation(1, 2);
	}

	/* Method with params, no return type
	 * public void operation(int a, int b) {
		System.out.println(a + b);
	}
	
	 * public void operation(int a, int b) { System.out.println(a+b); }
	 * 
	 * public void (int a, int b) { System.out.println(a+b); }
	 * 
	 * public (int a, int b) { System.out.println(a+b); }
	 * 
	 * (int a, int b) { System.out.println(a+b); }
	 * 
	 * (int a, int b) -> { System.out.println(a+b); }
	 * 
	 * //With TypeInference, you can also remove the type of params (a, b) ->
	 * System.out.println(a+b);
	 * 
	 * 
	 * 
	 * 
	 */
}
