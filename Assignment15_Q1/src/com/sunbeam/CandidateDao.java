package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//INSERT UPDATE DELETE FINDBYID FINDBYPARTY ALL
public class CandidateDao implements AutoCloseable {
	private Connection con;
	private PreparedStatement  stmtInsert;
	private PreparedStatement  stmtUpdate;
	private PreparedStatement  stmtDelete;
	private PreparedStatement  stmtFindById;
	private PreparedStatement  stmtFindByParty;
	private PreparedStatement  stmtDisplayAll;
	private PreparedStatement  stmtPartyWiseVotes;
	
	public CandidateDao() throws Exception {
		con = DbUtil.getConnection();
		String sql = "Insert into candidates values(default, ?,?,?)";
		stmtInsert = con.prepareStatement(sql);
		
		String sql2 ="Update candidates set name = ?, party=?, votes=? where id = ?";
		stmtUpdate= con.prepareStatement(sql2);
		
		String sql3 ="Delete from candidates where id = ?";
		stmtDelete = con.prepareStatement(sql3);
		
		String sql4="Select * from candidates where id =?";
		stmtFindById=con.prepareStatement(sql4);
		
		String sql5= "Select * from candidates where party=?";
		stmtFindByParty=con.prepareStatement(sql5);
		
		String sql6= "select * from candidates";
		stmtDisplayAll = con.prepareStatement(sql6);
		
		String sql7= "select party, sum(votes) total from candidates group by party";
		stmtPartyWiseVotes = con.prepareStatement(sql7);
		
	}
	
	@Override
	public void close() throws Exception {
		try {
			if(stmtPartyWiseVotes!=null)
				stmtPartyWiseVotes.close();
			if(stmtDisplayAll!=null)
				stmtDisplayAll.close();
			if(stmtFindByParty!=null)
				stmtFindByParty.close();
			if(stmtFindById!=null)
				stmtFindById.close();
			if(stmtDelete!=null)
				stmtDelete.close();
			if(stmtUpdate!=null)
				stmtUpdate.close();
			if(stmtInsert!=null)
				stmtInsert.close();
			if(con!=null)
				con.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public  int insertCandidate(Candidate c) throws Exception{
		String name =c.getName();
		String party = c.getParty();
		int votes = c.getVotes();

		stmtInsert.setString(1, name);
		stmtInsert.setString(2, party);
		stmtInsert.setInt(3, votes);
		
		int count = stmtInsert.executeUpdate();
		return count;	
	}
	
	public int updateCandidate(Candidate c) throws Exception{
		String name =c.getName();
		String party = c.getParty();
		int votes = c.getVotes();
		int id = c.getId();

		stmtUpdate.setString(1, name);
		stmtUpdate.setString(2, party);
		stmtUpdate.setInt(3, votes);
		stmtUpdate.setInt(4, id);
		
		int count = stmtUpdate.executeUpdate();
		return count;
	}
	
	public int deleteCandidate(int id) throws Exception{
		stmtDelete.setInt(1,id);
		int count = stmtDelete.executeUpdate();
		return count;
		
	}
	
	public Candidate findCandidateById(int id) throws Exception{
		stmtFindById.setInt(1, id);
		
		try(ResultSet rs= stmtFindById.executeQuery()){
			if(rs.next()) {
				String name = rs.getString("name");
				String party = rs.getString("party");
				int votes = rs.getInt("votes");
				Candidate c = new Candidate(id,name,party,votes);
				return c;
			}
		}
		return null;
	}
	
	public List<Candidate> findCandidateByParty(String party) throws Exception{
		List<Candidate> list = new ArrayList<Candidate>();
		stmtFindByParty.setString(1, party);
		
		try(ResultSet rs= stmtFindByParty.executeQuery()){
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int votes = rs.getInt("votes");
				Candidate c = new Candidate(id,name,party,votes);
				list.add(c);
			}
		}
		return list;
	} 
	
	public List<Candidate> displayAll() throws Exception{
		List<Candidate> list = new ArrayList<Candidate>();
		
		try(ResultSet rs= stmtDisplayAll.executeQuery()){
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String party = rs.getString("party");
				int votes = rs.getInt("votes");
				Candidate c = new Candidate(id,name,party,votes);
				list.add(c);
			}
		}
		return list;
	} 
	
	public List<PartyVotes> displayPartyWiseVotes() throws Exception{
		List<PartyVotes> list = new ArrayList<PartyVotes>();
		try(ResultSet rs= stmtPartyWiseVotes.executeQuery()){
			while(rs.next()) {

				String party = rs.getString("party");
				int votes = rs.getInt("total");
				PartyVotes c = new PartyVotes(party,votes);
				list.add(c);
			}
		}
			
		return list;
	}
	
	

}
