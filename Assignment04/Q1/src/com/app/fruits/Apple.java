package com.app.fruits;

public class Apple extends Fruit {
 
	public Apple(String name,double weight,String color) {
		super(name, color,weight);
	}
	
	@Override
	public String taste() {
		return "Sweet n sour";
		
	}

	@Override
	public String toString() {
		return "Apple [" + super.toString() + "]";
	}
	
	
}
