package com.javadude.factories.cars.app2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.javadude.factories.cars.Camry;
import com.javadude.factories.cars.Convertible;
import com.javadude.factories.cars.Corolla;
import com.javadude.factories.cars.Coupe;
import com.javadude.factories.cars.MR2;
import com.javadude.factories.cars.Mustang;
import com.javadude.factories.cars.Probe;
import com.javadude.factories.cars.Sedan;
import com.javadude.factories.cars.Taurus;

public class Factory {
	private static final Properties properties;
	static {
		try {
			InputStream inputStream = Factory.class.getResourceAsStream("factory.properties");
			properties = new Properties();
			properties.load(inputStream);
		} catch (IOException e) {
			throw new ExceptionInInitializerError(e);
		}
	}
	
	
	public static Sedan createSedan() {
		if ("Camry".equals(properties.getProperty("sedan")))
			return new Camry();
		return new Taurus();
	}
	public static Convertible createConvertible() {
		if ("MR2".equals(properties.getProperty("convertible")))
			return new MR2();
		return new Mustang();
	}
	public static Coupe createCoupe() {
		if ("Corolla".equals(properties.getProperty("coupe")))
			return new Corolla();
		return new Probe();
	}
}
