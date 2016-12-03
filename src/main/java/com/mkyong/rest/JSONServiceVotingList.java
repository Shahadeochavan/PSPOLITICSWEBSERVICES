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
		votingList.add(voting);
		votingLists.setVotingLists(votingList);

		return votingLists; 
	}


}
