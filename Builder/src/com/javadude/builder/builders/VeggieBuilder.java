package com.javadude.builder.builders;

import com.javadude.builder.Pizza;

public interface VeggieBuilder {
	void addMushrooms(Pizza pizza);
	void addPeppers(Pizza pizza);
	void addNastyStuff(Pizza pizza);
}
