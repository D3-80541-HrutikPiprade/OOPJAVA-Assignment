package com.sunbeam;

import java.util.Scanner;

enum Menu{
	EXIT, ADD_PERSON, DISPLAY_ALL, SEARCH_PERSON
}
public class MainTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of person : ");
		int size = sc.nextInt();
		int choice,count = 0;
		Menu m;
		Person[] p = new Person[size];
		
		Menu[] arr = Menu.values();
		while(true)
		{
			System.out.println("-------------------------------------------");
			for(Menu i: arr)
				System.out.println(i.ordinal()+ ". " + i.name());
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			System.out.println("-------------------------------------------");
			m= arr[choice];
			switch (m) {
			case EXIT:
				System.out.println("Thank you !!!");
				System.exit(0);
				
				break;

			case ADD_PERSON:
				if(count<size)
				{
					p[count]= new Person();
					p[count].accept();
					count++;
				}
				else
					System.out.println("Size full !!!");
				break;
				
			case DISPLAY_ALL:
				for(Person pp:p)
					if(pp!=null)
						System.out.println(pp.toString());
				break;
	
			case SEARCH_PERSON:
				System.out.println("Enter name to search : ");
				String s = sc.next();
				for(Person pp : p)
					if(pp != null)
						if( s.compareTo(pp.getName())==0)
							System.out.println(pp.toString());
				break;
				
			default:
				System.out.println("Enter valid input !!! ");
				break;
			}
		}
	}

}
