package com.sunbeam;

import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d1 = new Date();
		System.out.println("Enter the month day year : ");
		d1.setMonth(sc.nextInt());
		d1.setDay(sc.nextInt());
		d1.setYear(sc.nextInt());
		
		System.out.println("Date : "+ d1.getMonth() +" / "+ d1.getDay() + " / " + d1.getYear());
		d1.displayDate();
		
	}

}
