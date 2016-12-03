package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
@Path("/json/votingschedule")
public class JSONServiceVotingSchedule {

	@GET
	@Path("/get")
	@Produces("application/json")
	public VotingSchedules getVotingScheduleInJSON() {
		System.out.println("votingschedulejson...");
		VotingSchedules votingSchedules= new VotingSchedules();
		List<VotingSchedule> VotingSchedulesList = new ArrayList<VotingSchedule>();
		VotingSchedule votingSchedule = new VotingSchedule();
		votingSchedule.setVotingDay("Sunday");
		votingSchedule.setVotingDate("12/12/2016");
		votingSchedule.setVotingStartTime("07:00");
		votingSchedule.setVotingEndTime("05:00");
		VotingSchedulesList.add(votingSchedule);
		votingSchedules.setVotingSchedule(VotingSchedulesList);
		return votingSchedules; 
	}

}
