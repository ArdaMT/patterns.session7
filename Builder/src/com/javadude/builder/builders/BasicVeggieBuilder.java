package com.javadude.builder.builders;

import com.javadude.builder.Pizza;

public class BasicVeggieBuilder implements VeggieBuilder {

	@Override
	public void addMushrooms(Pizza pizza) {
		pizza.add("Mushrooms");
	}

	@Override
	public void addPeppers(Pizza pizza) {
		pizza.add("Peppers (yum!)");
	}

	@Override
	public void addNastyStuff(Pizza pizza) {
		pizza.add("NASTY nasty nasty stuff");
	}
}
