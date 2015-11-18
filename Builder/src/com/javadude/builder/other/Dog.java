package com.javadude.builder.other;

public class Dog {
	public enum Type {
		Corgi, Pug, Other;
	}
	private String name;
	private int age = -1;
	private Type type;
	
	public Dog(String name, int age, Type type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", type=" + type + "]";
	}

	public static class Builder {
		private String name;
		private int age = -1;
		private Type type;
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		public Builder type(Type type) {
			this.type = type;
			return this;
		}
		public Dog build() {
			if (name == null || age == -1 || type == null)
				throw new IllegalStateException("Must specify name, age and type before calling build!");
			return new Dog(name, age, type);
		}
	}
}
