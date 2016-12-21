package com.mkyong.rest;

import java.sql.Connection;
import java.util.ArrayList;
import com.nextech.pspolitics.model.VotingSchedule;
import com.nextech.pspoltics.dao.Database;
public class VotingScheduleManager {
	public ArrayList<VotingSchedule> getVotingSchedule() throws Exception {
		ArrayList<VotingSchedule> votingScheduleList = new ArrayList<VotingSchedule>();
		Database db = new Database();
		Connection con = db.getConnection();
		VotingScheduleData meetingData = new VotingScheduleData();
		votingScheduleList = meetingData.getVotingSchedule(con);
		System.out.println("I am in about nitin manager");
		return votingScheduleList;
	}

}
