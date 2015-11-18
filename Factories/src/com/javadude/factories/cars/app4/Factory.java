package com.javadude.factories.cars.app4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.javadude.factories.cars.Convertible;
import com.javadude.factories.cars.Coupe;
import com.javadude.factories.cars.Sedan;

public class Factory {
	private static final Properties properties;
	private static final CarFactory CAR_FACTORY;
	static {
		try {
			InputStream inputStream = Factory.class.getResourceAsStream("factory.properties");
			properties = new Properties();
			properties.load(inputStream);
			
			CAR_FACTORY = (CarFactory) createInstance(properties.getProperty("car.factory"));
			
		} catch (IOException e) {
			throw new ExceptionInInitializerError(e);
		}
	}
	
	private static Object createInstance(String className) {
		try {
			Class<?> clazz = Class.forName(className);
			return clazz.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static Sedan createSedan() {
		return CAR_FACTORY.createSedan();
	}
	public static Convertible createConvertible() {
		return CAR_FACTORY.createConvertible();
	}
	public static Coupe createCoupe() {
		return CAR_FACTORY.createCoupe();
	}
}
