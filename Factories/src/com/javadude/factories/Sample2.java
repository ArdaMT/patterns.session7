package com.javadude.factories;

public class Sample2 {
	public void foo3() {
		Barker barker = createBarker();
		barker.bark();
	}
	
	private Barker createBarker() {
		return new DireWolf();
	}
}
