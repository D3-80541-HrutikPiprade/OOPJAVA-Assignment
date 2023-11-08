package com.sunbeam;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;


public class TestProgram {
	public static User accept(Scanner sc) throws Exception{
		System.out.println("Enter first_name:");
		String first_name= sc.next();
		System.out.println("Enter last_name:");
		String last_name= sc.next();
		System.out.println("Enter email:");
		String email= sc.next(); 
		System.out.println("Enter password:");
		String password= sc.next(); 
		System.out.println("Enter dob:");
		String dob= sc.next(); 
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDate = sdf.parse(dob);
		
		System.out.println("Enter status :");
		int status = sc.nextInt();
		System.out.println("Enter Role : ");
		String role =sc.next();
		
		return new User(0,first_name,last_name,email,password,uDate,status,role);
		
	}
	
	public static User update(Scanner sc) throws Exception{
		System.out.println("Enter id to update :");
		int id = sc.nextInt();
		System.out.println("Enter first_name:");
		String first_name= sc.next();
		System.out.println("Enter last_name:");
		String last_name= sc.next();
		System.out.println("Enter email:");
		String email= sc.next(); 
		System.out.println("Enter password:");
		String password= sc.next(); 
		System.out.println("Enter dob:");
		String dob= sc.next(); 
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDate = sdf.parse(dob);
		
		System.out.println("Enter status :");
		int status = sc.nextInt();
		System.out.println("Enter Role : ");
		String role =sc.next();
		
		return new User(id,first_name,last_name,email,password,uDate,status,role);
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EMenu choice ;
		EMenu[] arr = EMenu.values();
		int count;
		User u = null;
		try(UserDao dao = new UserDao())
		{
			while(true)
			{
				for(EMenu m:arr)
					System.out.println(m.ordinal() + ".  " + m.name());
				System.out.print("Enter your choice : ");
				choice = arr[sc.nextInt()];
				switch (choice) {
				case EXIT:
					System.out.println("Thank you!!!");
					System.exit(0);
					break;
				case INSERT_USER:
					u = accept(sc);
					count = dao.insert(u);
					System.out.println("Row inserted : "+count);
					break;
				
				case DISPLAY_ALL_USERS:
					List<User> list = dao.displayAll();
					list.forEach(a->System.out.println(a));
					break;
				
				case UPDATE_USER:
					u = update(sc);
					count = dao.update(u);
					System.out.println("Rows Affected : "+ count);
					
					break;
					
				case DELETE_USER:
					System.out.print("Enter id to delete : ");
					int idd = sc.nextInt();
					count = dao.delete(idd);
					System.out.println("Row deleted : "+count);
					break;
					
				case DISPLAY_USER_BY_ID:
					System.out.print("Enter id to find : ");
					int idf = sc.nextInt();
					u = dao.find(idf);
					System.out.println(u);
					break;

				default:
					System.out.println("Enter valid input !!!");
					break;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
