package com.javadude.builder.builders;

import com.javadude.builder.Pizza;

public class FancyVeggieBuilder implements VeggieBuilder {

	@Override
	public void addMushrooms(Pizza pizza) {
		pizza.add("Fungus d'jour");
	}

	@Override
	public void addPeppers(Pizza pizza) {
		pizza.add("Precisely-colored peppers");
	}

	@Override
	public void addNastyStuff(Pizza pizza) {
		pizza.add("Colorful NASTY nasty nasty stuff");
	}
}
