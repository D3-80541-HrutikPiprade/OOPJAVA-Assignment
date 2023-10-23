package com.sunbeam;

public class Date {
	private int month;
	private int day;
	private int year;
	
	public Date() {
		this.month = 1;
		this.day = 1;
		this.year = 2000;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayDate()
	{
		System.out.println("Date : "+ month +" / "+ day + " / " + year);
	}

	
}
