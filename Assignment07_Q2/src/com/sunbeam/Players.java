package com.sunbeam;

public class Players {

	public static int batterTotalRuns(Player[] arr) {
		
		int runs =0;
		for(Player p : arr) {
			if(p instanceof Batter) {
				Batter b = (Batter)p;
				runs= runs + b.getRuns();
			}
		}
		return runs;
		
	}
	
	public static int bowlerTotalWickets(Player[] arr)
	{
		int wicket =0;
		for(Player p : arr) {
			if(p instanceof Bowler) {
				Bowler b = (Bowler)p;
				wicket= wicket+ b.getWickets();
			} 
		}
		return wicket;	
	}
	
	
	public static int countBatters(Player[] arr)
	{
		int count =0;
		for(Player p : arr) {
			if(p instanceof Batter) {
				Cricketer b = (Cricketer)p;
				if(b.getBallplayed() > 0)
				{
					count++;
				}
			} 
		}
		return count;
	}
	
	public static int countBowlers(Player[] arr)
	{
		int count =0;
		for(Player p : arr) {
			if(p instanceof Bowler) {
				Cricketer b = (Cricketer)p;
				if(b.getBallsBowled() > 0)
				{
					count++;
				}
			} 
		}
		return count;
	}
	
	public static Player maxRunBatter(Player[] arr) {
		
		Player m =null;
		int max=0;
		for(Player p : arr) {
			if(p instanceof Batter) {
				Cricketer b = (Cricketer)p;
				if(b.getRuns()>max)
				{
					max=b.getRuns();
					m=b;
				}
			} 
		}
		
		return m;
	}
	
	public static Player maxWicketBowler(Player[] arr)
	{
		Player m =null;
		int max=0;
		for(Player p : arr) {
			if(p instanceof Bowler) {
				Cricketer b = (Cricketer)p;
				if(b.getWickets()>max)
				{
					max=b.getWickets();
					m=b;
				}
			} 
		}
		
		return m;
	}
	
	
	
	
	
}
