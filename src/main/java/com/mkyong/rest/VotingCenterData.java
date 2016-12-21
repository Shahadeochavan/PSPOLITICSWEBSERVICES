package com.mkyong.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nextech.pspolitics.model.Meeting;
import com.nextech.pspolitics.model.VotingCenter;

public class VotingCenterData {
	public ArrayList<VotingCenter> getVotingCenter(Connection con)
			throws SQLException {
		ArrayList<VotingCenter> votingCenterList = new ArrayList<VotingCenter>(); 
		PreparedStatement stmt = con
				.prepareStatement(" SELECT * FROM voting_center");      
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				VotingCenter votingCenter = new VotingCenter();
				votingCenter.setAddress(rs.getString("address"));
				votingCenter.setPlaceName(rs.getString("placeName"));
				votingCenter.setDate(rs.getString("Date"));
				votingCenter.setStartTime(rs.getString("start_time"));
				votingCenter.setEndTime(rs.getString("end_time"));
				votingCenterList.add(votingCenter);
		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return votingCenterList;

	}

}
