package com.javadude.factories.cars.app1;

import com.javadude.factories.cars.Camry;
import com.javadude.factories.cars.Convertible;
import com.javadude.factories.cars.Corolla;
import com.javadude.factories.cars.Coupe;
import com.javadude.factories.cars.MR2;
import com.javadude.factories.cars.Sedan;

public class Factory {
	public static Sedan createSedan() {
		return new Camry();
	}
	public static Convertible createConvertible() {
		return new MR2();
	}
	public static Coupe createCoupe() {
		return new Corolla();
	}
}
