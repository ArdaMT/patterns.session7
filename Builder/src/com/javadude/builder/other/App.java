package com.javadude.builder.other;

import com.javadude.builder.other.Dog.Type;

public class App {
	public static void main(String[] args) {
		Dog dog = new Dog.Builder()
						.name("Fido")
						.age(2)
						.type(Type.Corgi)
						.build();
		
		System.out.println(dog);
	}
}
