package com.mkyong.rest;

import java.sql.Connection;
import java.util.ArrayList;
import com.nextech.pspolitics.model.Rally;
import com.nextech.pspoltics.dao.Database;

public class RallyManager {
	public ArrayList<Rally> getRally() throws Exception {
		ArrayList<Rally> rallyList = new ArrayList<Rally>();
		Database db = new Database();
		Connection con = db.getConnection();
		RallyData meetingData = new RallyData();
		rallyList = meetingData.getRally(con);
		System.out.println("I am in about nitin manager");
		return rallyList;
	}

}
