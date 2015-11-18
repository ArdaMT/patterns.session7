package com.javadude.factories.cars.app5;

import com.javadude.factories.cars.Convertible;
import com.javadude.factories.cars.Coupe;
import com.javadude.factories.cars.Sedan;

public class App {
	public static void main(String[] args) {
		doTest(new ToyotaFactory());
		doTest(new FordFactory());
	}
	
	public static void doTest(CarFactory carFactory) {
		Sedan sedan = carFactory.createSedan();
		Convertible convertible = carFactory.createConvertible();
		Coupe coupe = carFactory.createCoupe();
		
		System.out.println(sedan.getClass().getName());
		System.out.println(convertible.getClass().getName());
		System.out.println(coupe.getClass().getName());
	}
}
