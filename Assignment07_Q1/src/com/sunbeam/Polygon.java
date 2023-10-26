package com.sunbeam;

public abstract class Polygon extends BoundedShape {

	private int noSides;
	
	public Polygon(int noSides) {
		this.noSides = noSides;
	}
	public int getNoSides() {
		return noSides;
	}
	

}
