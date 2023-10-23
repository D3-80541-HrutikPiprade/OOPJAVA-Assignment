package com.app.geometry;

public class Point2D {
	private int x;
	private int y;
	
	public Point2D() {
		this.x = 0;
		this.y = 0;
	}

	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

//	public static boolean isEqual(Point2D a,Point2D b)
//	{
//		if(a.x==b.x && a.y==b.y)
//		{
//			return true;
//		}
//		else
//			return false;
//	}
	
	public boolean isEqual(Point2D a)
	{
		if(this.x == a.x && this.y == a.y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public double calculateDistance(Point2D a)
	{
		double distance =Math.sqrt(Math.pow((this.y-a.y), 2)+Math.pow((this.x-a.x), 2) );
		return distance;
	}
	
	
	
    
}
