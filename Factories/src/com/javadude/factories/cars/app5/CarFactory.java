package com.javadude.factories.cars.app5;

import com.javadude.factories.cars.Convertible;
import com.javadude.factories.cars.Coupe;
import com.javadude.factories.cars.Sedan;

public interface CarFactory {
	Sedan createSedan();
	Convertible createConvertible();
	Coupe createCoupe();
}
