package com.javadude.builder.builders;

import com.javadude.builder.Pizza;

public interface CoreBuilder {
	void rollDough(Pizza pizza);
	void spreadSauce(Pizza pizza);
	void addCheese(Pizza pizza);
}
