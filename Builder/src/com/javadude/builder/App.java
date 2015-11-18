package com.javadude.builder;

import com.javadude.builder.builders.BasicCoreBuilder;
import com.javadude.builder.builders.BasicMeatBuilder;
import com.javadude.builder.builders.BasicVeggieBuilder;
import com.javadude.builder.builders.FancyCoreBuilder;
import com.javadude.builder.builders.FancyVeggieBuilder;
import com.javadude.builder.directors.EverythingDirector;
import com.javadude.builder.directors.PizzaDirector;
import com.javadude.builder.directors.VeggieDirector;

public class App {
	public static void main(String[] args) {
		go(new EverythingDirector(
					new BasicCoreBuilder(), 
					new BasicMeatBuilder(), 
					new BasicVeggieBuilder()));
		
		go(new VeggieDirector(
					new BasicCoreBuilder(), 
					new BasicVeggieBuilder()));
		
		go(new VeggieDirector(
					new FancyCoreBuilder(), 
					new FancyVeggieBuilder()));
		
	}
	
	private static void go(PizzaDirector director) {
		Pizza pizza = director.makePizza();
		System.out.println(pizza);
	}
	
}
