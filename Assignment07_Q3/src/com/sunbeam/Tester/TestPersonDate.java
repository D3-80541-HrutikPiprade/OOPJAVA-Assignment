package com.sunbeam.Tester;


import com.sunbeam.Date;
import com.sunbeam.Person;

public class TestPersonDate {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Date d1= new Date(30,4,2000);
		System.out.println("d1 = " + d1.toString());
		
		Date d2 = (Date)d1.clone();
		System.out.println("d2 = " + d2.toString());
		Person p1= new Person("Abc", 65, d1);
		System.out.println("p1 = " + p1.toString());
		Person p2 = (Person) p1.clone();
		System.out.println("p2 = " + p2.toString());
		d1.setDay(20);
		d1.setMonth(12);
		System.out.println("After Date Change in d1 ");
		System.out.println("p1 = " + p1.toString());
		System.out.println("p2 = " + p2.toString());


	}

}
