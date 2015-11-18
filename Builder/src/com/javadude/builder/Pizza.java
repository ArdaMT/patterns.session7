package com.javadude.builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private List<String> items = new ArrayList<>();
	public void add(String item) {
		items.add(item);
	}
	@Override
	public String toString() {
		return "Pizza with " + items;
	}
}
