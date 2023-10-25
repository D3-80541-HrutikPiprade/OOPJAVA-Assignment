package com.app.fruits;

public class Orange extends Fruit {

	public Orange(String name,double weight,String color) {
		super(name, color,weight);
	}
	
	@Override
	public String taste() {
		
		return "sour";
	}

	@Override
	public String toString() {
		return "Orange [" + super.toString() + "]";
	}
	
	
}
