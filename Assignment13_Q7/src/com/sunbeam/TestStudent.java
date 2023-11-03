package com.sunbeam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TestStudent {

	public static void main(String[] args) {
		Map<Integer,Student> map = new LinkedHashMap<Integer, Student>();
		Scanner sc = new Scanner(System.in);
		Menu[] arr = Menu.values();
		Menu choice;
		while(true)
		{
			for(Menu m : arr)
				System.out.println(m.ordinal() + ". "+ m.name());
			System.out.print("Enter your choice : ");
			choice = arr[sc.nextInt()];
			switch (choice) {
			case EXIT:
				System.out.println("Thank you!!!");
				System.exit(0);
				break;
			case ADD:
				Student s = new Student();
				s.accept();
				System.out.println(s.toString());
				map.put(s.getRollNo(), s);
				break;
			case SEARCH:
				System.out.println("Enter roll no. to search : ");
				int rol = sc.nextInt();
				Student temp = map.get(rol);
				if(temp!=null)
				System.out.println(temp.toString());
				else
					System.out.println("Not found!!!");
				break;
				
			case DELETE:
				System.out.println("Enter roll no to delete : ");
				int roll= sc.nextInt();
				Student st = map.remove(roll);
				if(st==null)
					System.out.println("Not found !! - not deleted.");
				else
					System.out.println("Deleted- " + st);
				
				break;
			
			case DISPLAY_ALL:
				Set<Entry<Integer,Student>> enteries = map.entrySet();
				for(Entry<Integer,Student> stu : enteries)
						System.out.println(stu.getKey() +  "  -"+ stu.getValue() );
					System.out.println();
				break;
			default:
				break;
			}
		}
	}

}
