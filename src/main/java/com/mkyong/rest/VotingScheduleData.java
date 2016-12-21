package com.mkyong.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.nextech.pspolitics.model.VotingSchedule;

public class VotingScheduleData {
	public ArrayList<VotingSchedule> getVotingSchedule(Connection con)
			throws SQLException {
		ArrayList<VotingSchedule> votingScheduleList = new ArrayList<VotingSchedule>(); 
		PreparedStatement stmt = con
				.prepareStatement(" SELECT * FROM votingschedule");      
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				VotingSchedule votingSchedule = new VotingSchedule();
				votingSchedule.setVotingDay(rs.getString("votingDay"));
				votingSchedule.setVotingDate(rs.getString("votingDate"));
				votingSchedule.setVotingStartTime(rs.getString("votingStartTime"));
				votingSchedule.setVotingEndTime(rs.getString("votingEndtime"));
				votingScheduleList.add(votingSchedule);
		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return votingScheduleList;

	}
}
