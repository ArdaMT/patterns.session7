package com.javadude.builder.builders;

import com.javadude.builder.Pizza;

public class FancyMeatBuilder implements MeatBuilder {

	@Override
	public void addPepperoni(Pizza pizza) {
		pizza.add("Snobby Pepperoni");
	}

	@Override
	public void addSausage(Pizza pizza) {
		pizza.add("Snobby Sausage");
	}

	@Override
	public void addChicken(Pizza pizza) {
		pizza.add("Snobby Chicken");
	}
}
