package com.javadude.factories.cars.app4;

import com.javadude.factories.cars.Camry;
import com.javadude.factories.cars.Convertible;
import com.javadude.factories.cars.Corolla;
import com.javadude.factories.cars.Coupe;
import com.javadude.factories.cars.MR2;
import com.javadude.factories.cars.Sedan;

public class ToyotaFactory implements CarFactory {
	@Override
	public Sedan createSedan() {
		return new Camry();
	}

	@Override
	public Convertible createConvertible() {
		return new MR2();
	}

	@Override
	public Coupe createCoupe() {
		return new Corolla();
	}
}
