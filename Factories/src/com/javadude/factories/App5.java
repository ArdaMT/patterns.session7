package com.javadude.factories;

public class App5 {
	public static void main(String[] args) {
		Sample5 sample5 = new Sample5();

		sample5.setBarkerCreator(new DogCreator());
		sample5.foo();
		
		sample5.setBarkerCreator(new DireWolfCreator());
		sample5.foo();
	}
}
