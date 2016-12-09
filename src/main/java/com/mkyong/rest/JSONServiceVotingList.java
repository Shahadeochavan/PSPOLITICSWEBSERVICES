package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
@Path("/json/votinglist")
public class JSONServiceVotingList {
	@GET
	@Path("/get")
	@Produces("application/json")
	public VotingLists getVotingListInJSON() {
		System.out.println("getVotingListInJSON...");
		VotingLists votingLists= new VotingLists();
		List<VotingList> votingList = new ArrayList<VotingList>();
		VotingList voting = new VotingList();
		voting.setLastName("Chavan");
		voting.setFirstName("Shahadeo");
		voting.setMiddleName("Gowardhan");
		voting.setPhoneNumber("9403633306");
		voting.setWardDetails("ward Number 1");
		votingList.add(voting);
		votingLists.setVotingLists(votingList);
		
		voting=	new VotingList();
		voting.setFirstName("Sunil");
		voting.setMiddleName("Devidas");
		voting.setLastName("kale");
		voting.setWardDetails("ward number 2");
		voting.setPhoneNumber("9766024191");
		votingList.add(voting);
		votingLists.setVotingLists(votingList);
		
		voting=	new VotingList();
		voting.setFirstName("Ankush");
		voting.setMiddleName("Janardhan");
		voting.setLastName("Chavna");
		voting.setWardDetails("ward number 2");
		voting.setPhoneNumber("9766024191");
		votingList.add(voting);
		votingLists.setVotingLists(votingList);
		
		voting=	new VotingList();
		voting.setFirstName("Anil");
		voting.setMiddleName("Ram");
		voting.setLastName("Rathod");
		voting.setWardDetails("ward number 2");
		voting.setPhoneNumber("9766024191");
		votingList.add(voting);
		votingLists.setVotingLists(votingList);
		
		voting=	new VotingList();
		voting.setFirstName("Anil");
		voting.setMiddleName("Ram");
		voting.setLastName("Rathod");
		voting.setWardDetails("ward number 2");
		voting.setPhoneNumber("9766024191");
		votingList.add(voting);
		votingLists.setVotingLists(votingList);
		
		voting=	new VotingList();
		voting.setFirstName("Anil");
		voting.setMiddleName("Ram");
		voting.setLastName("Rathod");
		voting.setWardDetails("ward number 2");
		voting.setPhoneNumber("9766024191");
		votingList.add(voting);
		votingLists.setVotingLists(votingList);

		voting=	new VotingList();
		voting.setFirstName("Anil");
		voting.setMiddleName("Ram");
		voting.setLastName("Rathod");
		voting.setWardDetails("ward number 2");
		voting.setPhoneNumber("9766024191");
		votingList.add(voting);
		votingLists.setVotingLists(votingList);





		return votingLists; 
	}


}
