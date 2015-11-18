package com.javadude.builder.builders;

import com.javadude.builder.Pizza;

public class BasicCoreBuilder implements CoreBuilder {

	@Override
	public void rollDough(Pizza pizza) {
		pizza.add("Basic dough");
	}

	@Override
	public void spreadSauce(Pizza pizza) {
		pizza.add("Tomato sauce");
	}

	@Override
	public void addCheese(Pizza pizza) {
		pizza.add("Mozzarella Cheese");
	}
}
