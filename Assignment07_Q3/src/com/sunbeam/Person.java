package com.sunbeam;


public class Person implements Cloneable {
	private String name;
	private double weight;
	private Date birth;
	

	public Person(String name, double weight, Date d1) {
	
		this.name = name;
		this.weight = weight;
		this.birth = d1;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", birth=" + birth + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person temp = (Person)super.clone();
		temp.birth = (Date)this.birth.clone();
		return temp;
	}
}
