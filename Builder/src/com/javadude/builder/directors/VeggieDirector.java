package com.javadude.builder.directors;

import com.javadude.builder.Pizza;
import com.javadude.builder.builders.CoreBuilder;
import com.javadude.builder.builders.VeggieBuilder;

public class VeggieDirector implements PizzaDirector {
	private CoreBuilder coreBuilder;
	private VeggieBuilder veggieBuilder;
	
	public VeggieDirector(CoreBuilder coreBuilder, VeggieBuilder veggieBuilder) {
		this.coreBuilder = coreBuilder;
		this.veggieBuilder = veggieBuilder;
	}

	@Override
	public Pizza makePizza() {
		Pizza pizza = new Pizza();
		coreBuilder.rollDough(pizza);
		coreBuilder.addCheese(pizza);
		coreBuilder.spreadSauce(pizza);
		veggieBuilder.addMushrooms(pizza);
		veggieBuilder.addPeppers(pizza);
		veggieBuilder.addNastyStuff(pizza);
		return pizza;
	}

}
