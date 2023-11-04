package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
				case INSERT_CANDIDATE:
					String sql1 = "INSERT INTO candidates VALUES(default,?,?,?)";
					try(PreparedStatement stmt = con.prepareStatement(sql1)){
						System.out.print("Enter Name : ");
						String name = sc.next();
						System.out.print("Enter Party :");
						String party = sc.next();
						System.out.print("Enter Voters: ");
						int votes = sc.nextInt();
						
						stmt.setString(1, name);
						stmt.setString(2, party);
						stmt.setInt(3, votes);
						
						int count = stmt.executeUpdate();
						System.out.println("Rows Affected : "+ count);
						
					}
					break;
					
				case DISPLAY_ALL:
					String sql2 ="select * from candidates";
					try(PreparedStatement stmt = con.prepareStatement(sql2))
					{
						try(ResultSet rs = stmt.executeQuery())
						{
							while(rs.next())
							{
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n",id,name,party,votes);
							}
						}
					}
					
					break;
					
				case INCREAMENT_VOTERS_OF_CANDIDATE:
					System.out.println("Enter the Candidate id to increament : ");
					int incrId= sc.nextInt();
					System.out.println("Enter the votes to increment :");
					int incrVote = sc.nextInt();
					
					String sql3 = "update candidates set votes = votes + ? where id = ?";
					
					try(PreparedStatement stmt = con.prepareStatement(sql3)){
						
						
						stmt.setInt(1, incrVote);
						stmt.setInt(2,incrId );
						
						int count = stmt.executeUpdate();
						System.out.println("Rows Affected : "+ count);
						
					}
					
					break;
					
				case DELETE_CANDIDATE:
					System.out.println("Enter the Candidate id to delete : ");
					int delId= sc.nextInt();
					String sql4 ="Delete from candidates where id = ?";
					try(PreparedStatement stmt = con.prepareStatement(sql4))
					{
						stmt.setInt(1,delId);
						
						int count = stmt.executeUpdate();
						System.out.println("Rows Affected : "+ count);
					}
					
					break;
					
				case FIND_CANDIDATE_BY_ID:
					System.out.println("Enter the Candidate id to Find : ");
					int fId= sc.nextInt();
					String sql5= "Select * from candidates where id = ?";
					try(PreparedStatement stmt = con.prepareStatement(sql5))
					{
						stmt.setInt(1,fId);
						
						try(ResultSet rs = stmt.executeQuery())
						{
							while(rs.next())
							{
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n",id,name,party,votes);
							}
						}
					}
					
					break;
					
				case FIND_CANDIDATE_BY_PARTY:
					System.out.println("Enter the party to Find : ");
					String fParty= sc.next();
					String sql6= "Select * from candidates where party = ?";
					try(PreparedStatement stmt = con.prepareStatement(sql6))
					{
						stmt.setString(1,fParty);
						try(ResultSet rs = stmt.executeQuery())
						{
							while(rs.next())
							{
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n",id,name,party,votes);
							}
						}
					}
					
					break;
					
				case DISPLAY_TOTAL_VOTES_OF_PARTY:
					
					String sql7= "Select party, sum(votes) from candidates group by party";
					try(PreparedStatement stmt = con.prepareStatement(sql7))
					{
						try(ResultSet rs = stmt.executeQuery())
						{
							while(rs.next())
							{
								String party = rs.getString("party");
								int votes = rs.getInt("sum(votes)");
								
								System.out.printf(" %s, %d\n",party,votes);
							}
							
						}
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
