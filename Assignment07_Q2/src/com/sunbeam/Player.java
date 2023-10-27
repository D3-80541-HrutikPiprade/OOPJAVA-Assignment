package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public abstract class Player {
	private int id;
	private String name;
	private int age;
	private int matchPlayed;
	
	public Player() {
		this.id = 0;
		this.name = "";
		this.age = 0;
		this.matchPlayed = 0;
	}
	
	public Player(int id, String name, int age, int matchPlayed) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.matchPlayed = matchPlayed;
	}
	
	
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id : ");
		id= sc.nextInt();
		System.out.print("Enter name : ");
		name= sc.next();
		System.out.print("Enter age : ");
		age= sc.nextInt();
		System.out.print("Enter matchPlayed : ");
		matchPlayed= sc.nextInt();
	}



	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Player))
			return false;
		Player other = (Player) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Player-> id=" + id + ", name=" + name + ", age=" + age + ", matchPlayed=" + matchPlayed ;
	}
	
	
	
	
	
	
	
	
}
