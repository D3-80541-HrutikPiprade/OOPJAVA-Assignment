package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		
		System.out.println("Enter the cordinates of Point p1 : ");
		p1.setX(sc.nextInt());
		p1.setY(sc.nextInt());
		System.out.println(p1.toString());
		
		System.out.println("Enter the cordinates of Point p2 : ");
		p2.setX(sc.nextInt());
		p2.setY(sc.nextInt());
		System.out.println(p2.toString());
		
		double distance=0;
		if(p1.isEqual(p2))
		{
			System.out.println("P1 and P2 lies on same point distance is zero ");
			
		}
		else
		{
			distance = p1.calculateDistance(p2);
			System.out.println(" Distance = "+ distance );
		}
		
		
		
	}

}
