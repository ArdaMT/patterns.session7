package com.javadude.factories;

public class Sample5 {
	private BarkerCreator barkerCreator;
	public BarkerCreator getBarkerCreator() {
		return barkerCreator;
	}
	public void setBarkerCreator(BarkerCreator barkerCreator) {
		this.barkerCreator = barkerCreator;
	}

	public void foo() {
		Barker barker = barkerCreator.createBarker();
		barker.bark();
	}
}
