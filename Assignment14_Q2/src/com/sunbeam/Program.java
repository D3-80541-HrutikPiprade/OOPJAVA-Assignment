package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL ="jdbc:mysql://localhost:3306/Javadb";
	public static final String DB_USER = "D3_80541_Hrutik";
	public static final String DB_PASSWORD ="80541";
	
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch(Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){
			EMenu[] arr= EMenu.values();
			EMenu choice;
			while(true)
			{
				for(EMenu m:arr)
					System.out.println(m.ordinal() + ". "+ m.name());
				System.out.println("Enter your choice :");
				choice = arr[sc.nextInt()];
				switch (choice) {
				case EXIT:
					System.out.println("Thank you!!!");
					System.exit(0);
					break;
				case INSERT_USER:
					String sql1 = "INSERT INTO users VALUES(default,?,?,?,?,?,?,'Voter')";
					try(PreparedStatement stmt = con.prepareStatement(sql1)){
						System.out.print("Enter first_name : ");
						String first_name = sc.next();
						System.out.print("Enter last_name :");
						String last_name = sc.next();
						System.out.print("Enter email :");
						String email = sc.next();
						System.out.print("Enter password :");
						String password = sc.next();
						System.out.print("Enter dob :");
						String dateStr = sc.next();
						System.out.print("Enter status: ");
						boolean status = sc.nextBoolean();
						
						SimpleDateFormat sdf;
						sdf = new SimpleDateFormat("dd-MM-yyyy");
						java.util.Date uDate = sdf.parse(dateStr);
						java.sql.Date sDate;
						sDate = new java.sql.Date(uDate.getTime());
					
						stmt.setString(1, first_name);
						stmt.setString(2, last_name);
						stmt.setString(3, email);
						stmt.setString(4, password);
						stmt.setDate(5, sDate);
						stmt.setBoolean(6, status);
						
						int count = stmt.executeUpdate();
						System.out.println("Rows Affected : "+ count);
						
					}
					break;
					
				case DISPLAY_ALL_USER:
					String sql2 ="select * from users";
					try(PreparedStatement stmt = con.prepareStatement(sql2))
					{
						try(ResultSet rs = stmt.executeQuery())
						{
							while(rs.next())
							{
								//id | first_name | last_name | email             | password | dob        | status | role

								java.sql.Date sDate = rs.getDate("dob");
								
								int id = rs.getInt("id");
								String first_name = rs.getString("first_name");
								String last_name = rs.getString("last_name");
								String email = rs.getString("email");
								String password = rs.getString("password");
								
								java.sql.Date sDate2 = rs.getDate("dob");
								SimpleDateFormat sdf;
								sdf = new SimpleDateFormat("dd-MM-yyyy");
								String dateStr2 = sdf.format(sDate2);
								
								boolean status = rs.getBoolean("status");
								String role = rs.getString("role");
										
								System.out.printf("  %d, %s, %s, %s , %s, %s, %s, %s \n",id,first_name,last_name,email,password,dateStr2,status,role );
							}
						}
					}
					
					break;
					
					
				case DELETE_VOTER:
					System.out.println("Enter the Candidate id to delete : ");
					int delId= sc.nextInt();
					String sql4 ="Delete from users where id = ?";
					try(PreparedStatement stmt = con.prepareStatement(sql4))
					{
						stmt.setInt(1,delId);
						
						int count = stmt.executeUpdate();
						System.out.println("Rows Affected : "+ count);
					}
					
					break;
					
				case CHANGE_STATUS_TRUE_BY_ID:
					System.out.println("Enter the Candidate id to Change status to true : ");
					int cId= sc.nextInt();
					String sql5= "Update users set status = true where id = ?";
					try(PreparedStatement stmt = con.prepareStatement(sql5))
					{
						stmt.setInt(1,cId);
						
						int count = stmt.executeUpdate();
						System.out.println("Rows Affected : "+ count);
					}
					
					break;
					
				case CHANGE_NAME_DOB_OF_VOTER:
					System.out.println("Enter the Candidate id to Change : ");
					int cId1= sc.nextInt();
					System.out.println("Enter the Candidate updated first_name : ");
					String cfirst_Name = sc.next();
					
					System.out.println("Enter the Candidate updated first_name : ");
					String clast_Name = sc.next();
					
					System.out.println("Enter the Candidate updated Dob : ");
					String dateStr1 = sc.next();
	
					String sql6= "Update users set first_name = ?,last_name=? ,dob= ?  where id = ?";
					try(PreparedStatement stmt = con.prepareStatement(sql6))
					{
						SimpleDateFormat sdf1;
						sdf1 = new SimpleDateFormat("dd-MM-yyyy");
						java.util.Date uDate1 = sdf1.parse(dateStr1);
						java.sql.Date sDate1;
						sDate1 = new java.sql.Date(uDate1.getTime());
						
						
						stmt.setString(1, cfirst_Name);
						stmt.setString(2, clast_Name);
						stmt.setDate(3, sDate1);
						stmt.setInt(4,cId1);
						
						int count = stmt.executeUpdate();
						System.out.println("Rows Affected : "+ count);
					}
					
					break;
					

				default:
					System.out.println("Enter valid Input!!!");
					break;
				}
			}
		}catch (Exception e) {
		e.printStackTrace();
		}
	}
}
