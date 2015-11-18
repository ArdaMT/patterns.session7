package com.javadude.builder.directors;

import com.javadude.builder.Pizza;
import com.javadude.builder.builders.CoreBuilder;
import com.javadude.builder.builders.MeatBuilder;
import com.javadude.builder.builders.VeggieBuilder;

public class EverythingDirector implements PizzaDirector {
	private CoreBuilder coreBuilder;
	private MeatBuilder meatBuilder;
	private VeggieBuilder veggieBuilder;
	
	public EverythingDirector(CoreBuilder coreBuilder, MeatBuilder meatBuilder, VeggieBuilder veggieBuilder) {
		this.coreBuilder = coreBuilder;
		this.meatBuilder = meatBuilder;
		this.veggieBuilder = veggieBuilder;
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
		veggieBuilder.addMushrooms(pizza);
		veggieBuilder.addPeppers(pizza);
		veggieBuilder.addNastyStuff(pizza);
		return pizza;
	}

}
