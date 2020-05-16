package com.functional.learn.functionalinterfaces;

@FunctionalInterface
public interface FunctionalGenerics<T, R> {

	R execute(T t);

}
