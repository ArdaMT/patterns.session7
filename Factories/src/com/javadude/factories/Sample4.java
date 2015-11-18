package com.javadude.factories;

public class Sample4 extends Sample3 {
	protected Barker createBarker() {
		return new DireWolf();
	}
}
