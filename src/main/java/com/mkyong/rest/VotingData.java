package com.mkyong.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.nextech.pspolitics.model.VotingList;

public class VotingData {
	public ArrayList<VotingList> getVoting(Connection con)
			throws SQLException {
		ArrayList<VotingList> votingList = new ArrayList<VotingList>(); 
		PreparedStatement stmt = con
				.prepareStatement(" SELECT * FROM voting_List");      
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				VotingList voting = new VotingList();
				voting.setFirstName(rs.getString("firstName"));
				voting.setLastName(rs.getString("lastName"));
				voting.setMiddleName(rs.getString("middleName"));
				voting.setPhoneNumber(rs.getString("phoneNumber"));
				voting.setWardDetails(rs.getString("wardDetails"));
				votingList.add(voting);
		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return votingList;

	}
}
