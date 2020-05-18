package com.functional.learn.functionalprogramming.techniques;

public class FunctionalComposition {

	// The second function is executed first, the first is executed on the result of
	// the second function

	public static void main(String[] args) {

		//area of square
		Function<Square, Integer> fun1 = s -> s.getArea();
		//length of one side
		Function<Integer, Double> fun2 = area -> Math.sqrt(area);

		Function<Square, Double> getSide = fun2.compose(fun1);
		Square s = new Square();
		s.setArea(100);
		
		Double side = getSide.apply(s);
		System.out.println(side);
		
	}

}
