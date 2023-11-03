package com.sunbeam;

public class TestEmp {

	public static void main(String[] args) {
		Emp[] arr = new Emp[5];
		arr[0]= new Manager(1000,100);
		arr[1]= new Clerk(800);
		arr[2]= new Labor(400,10);
		arr[3]= new Labor(100,20);
		arr[4]= new Clerk(1000);
		
		for(Emp ele: arr)
			System.out.println(ele);
		
		System.out.println("Total Income of all emp : "+ Emp.calcTotalIncome(arr) );
		
		

	}

}
