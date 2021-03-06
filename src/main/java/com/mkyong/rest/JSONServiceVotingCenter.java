package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.nextech.pspolitics.model.Meeting;
import com.nextech.pspolitics.model.Meetings;
import com.nextech.pspolitics.model.VotingCenter;
import com.nextech.pspolitics.model.VotingCenters;
@Path("/json/votingcenter")
public class JSONServiceVotingCenter {
	@GET
	@Path("/get")
	@Produces("application/json; charset=utf-8")
	public String getVotingCenter() {
		System.out.println("getVotingCenter...");
		String votingcenter = null;
		VotingCenters votingCenters=new VotingCenters();
		try {
			ArrayList<VotingCenter> votingCentersList = new ArrayList<VotingCenter>();
			votingCentersList = new VotingCenterManager().getVotingCenter();
			votingCenters.setVotingCenters(votingCentersList);
			Gson gson = new Gson();
			votingcenter = gson.toJson(votingCenters);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return votingcenter;
	}

}
