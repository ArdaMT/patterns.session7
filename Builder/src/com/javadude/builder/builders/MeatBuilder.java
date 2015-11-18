package com.javadude.builder.builders;

import com.javadude.builder.Pizza;

public interface MeatBuilder {
	void addPepperoni(Pizza pizza);
	void addSausage(Pizza pizza);
	void addChicken(Pizza pizza);
}
