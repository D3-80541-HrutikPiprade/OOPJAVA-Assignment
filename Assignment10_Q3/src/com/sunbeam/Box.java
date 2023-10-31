package com.sunbeam;

public class Box<T extends Displayable> {
	private T obj;
	public void set(T obj) {
		this.obj=obj;
	}
	
	public T get() {
		return this.obj;
	}
	
	public void show()
	{
		obj.display();
	}
	
}
