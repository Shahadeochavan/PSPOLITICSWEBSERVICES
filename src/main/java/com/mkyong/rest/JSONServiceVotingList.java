package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.nextech.pspolitics.model.Meeting;
import com.nextech.pspolitics.model.Meetings;
import com.nextech.pspolitics.model.VotingList;
import com.nextech.pspolitics.model.VotingLists;
@Path("/json/votinglist")
public class JSONServiceVotingList {
	@GET
	@Path("/get")
	@Produces("application/json; charset=utf-8")
	public String getVoting() {
		System.out.println("getMeeting...");
		String voting = null;
		VotingLists votingLists=new VotingLists();
		try {
			ArrayList<VotingList> votingList = new ArrayList<VotingList>();
			votingList = new VotingManager().getVoting();
			votingLists.setVotingLists(votingList);
			Gson gson = new Gson();
			voting = gson.toJson(votingLists);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return voting;
	}
}
