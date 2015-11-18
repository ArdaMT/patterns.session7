package com.javadude.factories;

public class Sample3 {
	public void foo() {
		Barker barker = createBarker();
		barker.bark();
	}
	
	protected Barker createBarker() {
		return new Dog();
	}
}
