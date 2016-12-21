package com.mkyong.rest;

import java.sql.Connection;
import java.util.ArrayList;
import com.nextech.pspolitics.model.VotingCenter;
import com.nextech.pspoltics.dao.Database;

public class VotingCenterManager {
	public ArrayList<VotingCenter> getVotingCenter() throws Exception {
		ArrayList<VotingCenter> votingCenterList = new ArrayList<VotingCenter>();
		Database db = new Database();
		Connection con = db.getConnection();
		VotingCenterData access = new VotingCenterData();
		votingCenterList = access.getVotingCenter(con);
		return votingCenterList;
	}

}
