package com.sunbeam;

import java.util.Scanner;

public class Cricketer extends Player implements Batter, Bowler {

	private int runs;
	private int wickets;
	private int ballplayed;
	private int ballsBowled;
	private int runGiven;
	
	
	public Cricketer() {
		super();
		this.runs = 0;
		this.wickets = 0;
		this.ballplayed = 0;
		this.ballsBowled = 0;
		this.runGiven = 0;
	}
	public Cricketer(int id, String name, int age, int matchPlayed, int runs, int wickets, int ballplayed,
			int ballsBowled, int runGiven) {
		super(id, name, age, matchPlayed);
		this.runs = runs;
		this.wickets = wickets;
		this.ballplayed = ballplayed;
		this.ballsBowled = ballsBowled;
		this.runGiven = runGiven;
		
	}
	@Override
	public int getWickets() {
		return wickets;
	}

	@Override
	public double getEconomy() {
		double over = ballsBowled/6;
		double eco = (double)runGiven/over;
		return eco;
	}

	@Override
	public int getRuns() {
		return runs;
	}

	@Override
	public double getAverage() {
		double over = ballplayed/6;
		double avg = (double)runs/over;
		return avg;
	}

	@Override
	public double getStrikeRate() {
		return (runs/ballplayed)*100 ;
	}
	public int getBallsBowled() {
		return ballsBowled;
	}
	public void setBallsBowled(int ballsBowled) {
		this.ballsBowled = ballsBowled;
	}
	
	
	public int getBallplayed() {
		return ballplayed;
	}
	public void setBallplayed(int ballplayed) {
		this.ballplayed = ballplayed;
	}
	public void accept()
	{
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter runs : ");
		runs = sc.nextInt();
		System.out.print("Enter Wickets : ");
		wickets = sc.nextInt();
		System.out.print("Enter ball played : ");
		ballplayed = sc.nextInt();
		System.out.print("Enter ball bowled : ");
		ballsBowled = sc.nextInt();
		System.out.print("Enter run given : ");
		runGiven = sc.nextInt();
		
	}
	@Override
	public String toString() {
		return "Cricketer -> "+ super.toString()  +", runs=" + runs + ", wickets=" + wickets + ", ballplayed=" + ballplayed + ", ballsBowled="
				+ ballsBowled + ", runGiven=" + runGiven ;
	}
	
	
	
}
