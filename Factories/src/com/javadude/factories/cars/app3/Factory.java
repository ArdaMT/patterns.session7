package com.javadude.factories.cars.app3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.javadude.factories.cars.Convertible;
import com.javadude.factories.cars.Coupe;
import com.javadude.factories.cars.Sedan;

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
	
	private static Object createInstance(String className) {
		try {
			Class<?> clazz = Class.forName(className);
			return clazz.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static Sedan createSedan() {
		return (Sedan) createInstance(properties.getProperty("sedan"));
	}
	public static Convertible createConvertible() {
		return (Convertible) createInstance(properties.getProperty("convertible"));
	}
	public static Coupe createCoupe() {
		return (Coupe) createInstance(properties.getProperty("coupe"));
	}
}
