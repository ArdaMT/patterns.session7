package com.javadude.builder.builders;

import com.javadude.builder.Pizza;

public class BasicMeatBuilder implements MeatBuilder {

	@Override
	public void addPepperoni(Pizza pizza) {
		pizza.add("Pepperoni");
	}

	@Override
	public void addSausage(Pizza pizza) {
		pizza.add("Sausage");
	}

	@Override
	public void addChicken(Pizza pizza) {
		pizza.add("Chicken");
	}
}
