package com.mkyong.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.nextech.pspolitics.model.Rally;

public class RallyData {
	public ArrayList<Rally> getRally(Connection con)
			throws SQLException {
		ArrayList<Rally> rallyList = new ArrayList<Rally>(); 
		PreparedStatement stmt = con
				.prepareStatement(" SELECT * FROM rally");      
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Rally rally = new Rally();
				rally.setStartPoint(rs.getString("Rally_start_point"));
				rally.setEndPoint(rs.getString("Rally_end_point"));
				rally.setDate(rs.getString("Rally_Date"));
				rally.setRallyDay(rs.getString("Rally_Day"));
				rally.setStartTime(rs.getString("Rally_Start_Time"));
				rally.setEndTime(rs.getString("Rally_End_Time"));
				rallyList.add(rally);
		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rallyList;

	}
}
