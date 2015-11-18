package com.javadude.builder.directors;

import com.javadude.builder.Pizza;
import com.javadude.builder.builders.CoreBuilder;
import com.javadude.builder.builders.MeatBuilder;

public class MeatDirector implements PizzaDirector {
	private CoreBuilder coreBuilder;
	private MeatBuilder meatBuilder;
	
	public MeatDirector(CoreBuilder coreBuilder, MeatBuilder meatBuilder) {
		this.coreBuilder = coreBuilder;
		this.meatBuilder = meatBuilder;
	}

	@Override
	public Pizza makePizza() {
		Pizza pizza = new Pizza();
		coreBuilder.rollDough(pizza);
		coreBuilder.addCheese(pizza);
		coreBuilder.spreadSauce(pizza);
		meatBuilder.addChicken(pizza);
		meatBuilder.addPepperoni(pizza);
		meatBuilder.addSausage(pizza);
		return pizza;
	}

}
