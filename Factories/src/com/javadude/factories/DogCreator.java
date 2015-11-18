package com.javadude.factories;

public class DogCreator implements BarkerCreator {
	@Override
	public Barker createBarker() {
		return new Dog();
	}
}
