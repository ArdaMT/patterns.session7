package com.javadude.factories;

public class Sample1 {
	public void foo1a() {
		Dog dog = new Dog();
		dog.bark();
	}
	
	public void foo1b() {
		DireWolf direWolf = new DireWolf();
		direWolf.bark();
	}
	
	public void foo2a() {
		Barker barker = new Dog();
		barker.bark();
	}
	
	public void foo2b() {
		Barker barker = new Dog();
		barker.bark();
	}
	
	public void foo3() {
		Barker barker = createBarker();
		barker.bark();
	}
	
	private Barker createBarker() {
		return new Dog();
	}
}
