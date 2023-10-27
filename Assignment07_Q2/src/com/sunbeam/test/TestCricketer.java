package com.sunbeam.test;

import com.sunbeam.Cricketer;
import com.sunbeam.Player;
import com.sunbeam.Players;

public class TestCricketer {

	public static void main(String[] args) {
		
		Player[] team = new Player[11];
		for(int i=0; i<team.length;i++)
		{
			team[i] = new Cricketer();
			System.out.println("-----------------------------------");
			team[i].accept();
		}
		System.out.println("-----------------------------------");
		
		for(Player p: team)
		{
			Cricketer c = (Cricketer)p;
			System.out.println(c);	
		}
		
		int totalRuns = Players.batterTotalRuns(team);
		System.out.println("Total runs of all batters : " + totalRuns);
		
		int totalWickets= Players.bowlerTotalWickets(team);
		System.out.println("Total wickets : "+ totalWickets);
		
		int totalBatters= Players.countBatters(team);
		System.out.println("Total Batters : "+ totalBatters);
		
		int totalBowlers= Players.countBowlers(team);
		System.out.println("Total Bowler : "+ totalBowlers);
		
		Player maxRunPlayer = Players.maxRunBatter(team);
		System.out.print("Max Run Batter : ");
		System.out.println(maxRunPlayer.toString() );
		
		
		Player maxWicketPlayer = Players.maxWicketBowler(team);
		System.out.print("Max Wicket Bowler : ");
		System.out.println(maxWicketPlayer.toString() );
		
	}

}
