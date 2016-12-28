package com.mkyong.rest;

import java.sql.Connection;
import java.util.ArrayList;

import com.nextech.pspolitics.model.Meeting;
import com.nextech.pspolitics.model.VotingList;
import com.nextech.pspoltics.dao.Database;

public class VotingManager {
	public ArrayList<VotingList> getVoting() throws Exception {
		ArrayList<VotingList> votingList = new ArrayList<VotingList>();
		Database db = new Database();
		Connection con = db.getConnection();
		VotingData votingData = new VotingData();
		votingList = votingData.getVoting(con);
		System.out.println("I am in about nitin manager");
		return votingList;
	}
}
