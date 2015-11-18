package com.javadude.factories.cars.app5;

import com.javadude.factories.cars.Convertible;
import com.javadude.factories.cars.Coupe;
import com.javadude.factories.cars.Mustang;
import com.javadude.factories.cars.Probe;
import com.javadude.factories.cars.Sedan;
import com.javadude.factories.cars.Taurus;

public class FordFactory implements CarFactory {
	@Override
	public Sedan createSedan() {
		return new Taurus();
	}

	@Override
	public Convertible createConvertible() {
		return new Mustang();
	}

	@Override
	public Coupe createCoupe() {
		return new Probe();
	}
}
