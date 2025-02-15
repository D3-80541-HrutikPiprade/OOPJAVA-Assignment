package com.sunbeam;

public class Candidate {
	private int id;
	private String name;
	private String party;
	private int votes;
	
	
	public Candidate(int id, String name, String party, int votes) {
		
		this.id = id;
		this.name = name;
		this.party = party;
		this.votes = votes;
	}

	public Candidate() {
		
		this.id = 0;
		this.name = "";
		this.party = "";
		this.votes = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
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
		builder.append("Candidate [id=").append(id).append(", name=").append(name).append(", party=").append(party)
				.append(", votes=").append(votes).append("]");
		return builder.toString();
	}
	
	
	
}
