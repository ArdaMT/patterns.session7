package com.javadude.factories.cars.app4;

import com.javadude.factories.cars.Convertible;
import com.javadude.factories.cars.Coupe;
import com.javadude.factories.cars.Sedan;

public class App {
	public static void main(String[] args) {
		Sedan sedan = Factory.createSedan();
		Convertible convertible = Factory.createConvertible();
		Coupe coupe = Factory.createCoupe();
		
		System.out.println(sedan.getClass().getName());
		System.out.println(convertible.getClass().getName());
		System.out.println(coupe.getClass().getName());
	}
}
