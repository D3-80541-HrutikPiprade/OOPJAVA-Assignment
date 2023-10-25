package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	public static int menu(Scanner sc)
	{
		
		int choice;
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("0. EXIT ");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange ");
		System.out.println("3. Add Apple ");
		System.out.println("4. Display names of all fruits in the basket. ");
		System.out.println("5. Display name, color, weight, taste of all fresh fruits in the basket ");
		System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket. ");
		System.out.println("7. Mark a fruit s stale. ");
		System.out.println("8. Mark all sour fruits stale. ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		return choice;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of the basket : ");
		int size = sc.nextInt();
		Fruit[] basket= new Fruit[size];
		int counter = 0;
		
		int choice;
		while(true)
		{
			choice= menu(sc);
			switch (choice) {
			case 0:
				System.exit(0);
				break;
			
			case 1:
				
				if(counter >= size)
				{
					System.out.println("Basket Full !!");
				}
				else
				{
					basket[counter++]= new Mango("Mango",100.0,"Yellow");
				}
				break;
			
			case 2:
				if(counter >= size)
				{
					System.out.println("Basket Full !!");
				}
				else
				{
					basket[counter++]= new Orange("Orange",70.0,"Orange");
				}
				break;
				
			case 3:
				if(counter >= size)
				{
					System.out.println("Basket Full !!");
				}
				else
				{
					basket[counter++]= new Apple("Apple",125.0,"Red");
				}
				break;
				
			case 4:
				if(basket[0]==null)
				{
					System.out.println("Basket is empty!!");
				}
				else
				{
					for(Fruit element :basket)
					{
						if(element!=null)
						{
							System.out.println(element.getName());
						}
					}
					
				}
				break;
				
			case 5:
				
				for(Fruit element :basket)
					if(element!=null)
					{
						if(element.isFresh())
						{
							System.out.println(element.toString() + "[ taste : " + element.taste() + " ]");
						}
					}
					
				break;
				
			case 6:
				for(Fruit element :basket)
					if(element!=null)
					{
						if(!(element.isFresh()))
						{
							System.out.println(element.getName() + " - [ taste : Spoiled]");
						}
					}
				break;
				
			case 7:
				System.out.print("Enter the index of fruit to mark Stale : ");
				int index = sc.nextInt();
				if(basket[index-1] != null)
				{
					basket[index-1].setFresh(false);
					
				}
				break;
				
			case 8:
				for(Fruit element :basket)
				{
					if(element!=null)
					{
						if(element.equals("sour"))
						{
							element.setFresh(false);
						}
					}
					
				}
				break;

			default:
				System.out.println("Enter a Valid Choice!!!");
				break;
			}
		}
		
		
	}

}
