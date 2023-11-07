package com.sunbeam;

public class PartyVotes {
	private String Party;
	private int votes;
	public PartyVotes(String party, int votes) {
		super();
		Party = party;
		this.votes = votes;
	}
	public PartyVotes() {
		super();
		Party = "";
		this.votes = 0;
	}
	public String getParty() {
		return Party;
	}
	public void setParty(String party) {
		Party = party;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PartyVotes [Party=").append(Party).append(", votes=").append(votes).append("]");
		return builder.toString();
	}
	
	
	
}
