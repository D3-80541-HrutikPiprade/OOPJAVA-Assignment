package com.sunbeam;

import java.util.List;
import java.util.Scanner;

public class TestProgram {
	public static Candidate accept(Scanner sc) {
		Candidate c = new Candidate();
		System.out.print("Enter Name :");
		c.setName(sc.next());
		System.out.print("Enter Party :");
		c.setParty(sc.next());
		System.out.print("Enter votes :");
		c.setVotes(sc.nextInt());
		return c;
	}
	public static Candidate update(Scanner sc) {
		Candidate c = new Candidate();
		System.out.print("Enter id to update : ");
		c.setId(sc.nextInt());
		System.out.print("Enter Name :");
		c.setName(sc.next());
		System.out.print("Enter Party :");
		c.setParty(sc.next());
		System.out.print("Enter votes :");
		c.setVotes(sc.nextInt());
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EMenu[] arr = EMenu.values();
		EMenu choice;
		Candidate c=null;
		int count=0;
		
		try(CandidateDao dao= new CandidateDao()){
			while(true)
			{
				for(EMenu m:arr)
					System.out.println(m.ordinal()+". "+m.name());
				System.out.print("Enter your choice: ");
				choice = arr[sc.nextInt()];
				switch (choice) {
				case EXIT:
					System.out.println("Thank you!!!!");
					System.exit(0);
					break;
					
				case INSERT_CANDIDATE:
					c= accept(sc);
					count = dao.insertCandidate(c);
					System.out.println("Rows Inserted : "+ count);					
					break;
					
				case UPDATE_CANDIDATE:
					Candidate x= update(sc);
					count = dao.updateCandidate(x);
					System.out.println("Updated rows: "+count);
					break;
					
				case DELETE_CANDIDATE:
					System.out.print("Enter Candidate ID to delete :");
					int id = sc.nextInt();
					count =dao.deleteCandidate(id);
					System.out.println("Row Deleted : "+ count);
					break;
				
				case FIND_CANDIDATE_BY_ID:
					System.out.print("Enter Candidate ID to Find :");
					int idf = sc.nextInt();
					c = dao.findCandidateById(idf);
					System.out.println(c);
					break;
					
				case FIND_CANDIDATE_BY_PARTY:
					System.out.print("Enter Party to find candidate : ");
					String party= sc.next();
					
					List<Candidate> list= dao.findCandidateByParty(party);
					list.forEach(d-> System.out.println(d));
					
					break;
					
				case DISPLAY_ALL_CANDIDATE:
					List<Candidate> list1= dao.displayAll();
					list1.forEach(e-> System.out.println(e));
					break;
					
				case DISPLAY_PARTYWISE_VOTE:
					List<PartyVotes> list2 = dao.displayPartyWiseVotes();
					list2.forEach(f-> System.out.println(f));
					break;

				default:
					System.out.println("Enter valid choice!!!");
					break;
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
