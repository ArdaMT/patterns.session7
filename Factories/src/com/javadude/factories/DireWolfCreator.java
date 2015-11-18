package com.javadude.factories;

public class DireWolfCreator implements BarkerCreator {
	@Override
	public Barker createBarker() {
		return new DireWolf();
	}
}
