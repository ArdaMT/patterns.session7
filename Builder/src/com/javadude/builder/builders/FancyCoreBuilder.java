package com.javadude.builder.builders;

import com.javadude.builder.Pizza;

public class FancyCoreBuilder implements CoreBuilder {

	@Override
	public void rollDough(Pizza pizza) {
		pizza.add("Artisan dough");
	}

	@Override
	public void spreadSauce(Pizza pizza) {
		pizza.add("Artisan sauce");
	}

	@Override
	public void addCheese(Pizza pizza) {
		pizza.add("Artisan Cheese");
	}
}
