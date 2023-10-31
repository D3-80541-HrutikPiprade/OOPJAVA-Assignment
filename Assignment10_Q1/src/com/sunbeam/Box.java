package com.sunbeam;

public class Box<T extends Employee> {
	private T obj;
	public Box(T obj) {
		this.obj=obj;
	}
	
	public Box() {
	}

	public double totalSal() {
		return obj.calcSalary();
	}
	public void accept()
	{
		obj.acceptData();
	}
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
