package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
@Path("/json/votingcenter")
public class JSONServiceVotingCenter {
	@GET
	@Path("/get")
	@Produces("application/json")
	public VotingCenters getVotingCentersInJSON() {
		System.out.println("VotingCentersjson...");
		VotingCenters votingCenters= new VotingCenters();
		List<VotingCenter> votingCenterList = new ArrayList<VotingCenter>();
		VotingCenter votingCenter = new VotingCenter();
		votingCenter.setAddress("Wadegon");
		votingCenter.setPlaceName("High Scholl");
		votingCenter.setDate("12/12/2016");
		votingCenter.setStartTime("07:00");
		votingCenter.setEndTime("05:00");
		votingCenterList.add(votingCenter);
		votingCenters.setVotingCenters(votingCenterList);
		
		votingCenter = new VotingCenter();
		votingCenter.setAddress("Pune");
		votingCenter.setPlaceName("Z.P. Scholl");
		votingCenter.setDate("12/12/2016");
		votingCenter.setStartTime("07:00");
		votingCenter.setEndTime("05:00");
		votingCenterList.add(votingCenter);
		votingCenters.setVotingCenters(votingCenterList);
		
		votingCenter = new VotingCenter();
		votingCenter.setAddress("Parner");
		votingCenter.setPlaceName("Z.P. Scholl");
		votingCenter.setDate("12/12/2016");
		votingCenter.setStartTime("07:00");
		votingCenter.setEndTime("05:00");
		votingCenterList.add(votingCenter);
		votingCenters.setVotingCenters(votingCenterList);
		
		votingCenter = new VotingCenter();
		votingCenter.setAddress("katraj");
		votingCenter.setPlaceName("Z.P. Scholl");
		votingCenter.setDate("12/12/2016");
		votingCenter.setStartTime("07:00");
		votingCenter.setEndTime("05:00");
		votingCenterList.add(votingCenter);
		votingCenters.setVotingCenters(votingCenterList);
		return votingCenters; 
	}

}
