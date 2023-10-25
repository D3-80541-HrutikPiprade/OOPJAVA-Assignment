package com.app.fruits;

import java.util.Objects;

public abstract class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public Fruit(String name,String color, double weight) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = true;
	}
	public Fruit() {
		this.color = "";
		this.weight = 0.0;
		this.name = "";
		this.isFresh = true;
	}
	
	public String taste()
	{
		return "no specific taste";
	}
	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(isFresh);
	}
	
	public boolean equals(String s) {
		return (this.taste()== s);
	}
	
	
	
	
	
	
	
}
