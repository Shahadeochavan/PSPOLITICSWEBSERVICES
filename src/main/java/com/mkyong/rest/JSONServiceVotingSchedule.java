package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.nextech.pspolitics.model.VotingCenter;
import com.nextech.pspolitics.model.VotingCenters;
import com.nextech.pspolitics.model.VotingSchedule;
import com.nextech.pspolitics.model.VotingSchedules;
@Path("/json/votingschedule")
public class JSONServiceVotingSchedule {

	@GET
	@Path("/get")
	@Produces("application/json; charset=utf-8")
	public String getVotingSchdeule() {
		System.out.println("getVotingSchdule...");
		String votingSchedule = null;
		VotingSchedules votingSchedules=new VotingSchedules();
		try {
			ArrayList<VotingSchedule> votingScheduleList = new ArrayList<VotingSchedule>();
			votingScheduleList = new VotingScheduleManager().getVotingSchedule();
			votingSchedules.setVotingSchedule(votingScheduleList);
			Gson gson = new Gson();
			votingSchedule = gson.toJson(votingSchedules);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return votingSchedule;
	}

}
