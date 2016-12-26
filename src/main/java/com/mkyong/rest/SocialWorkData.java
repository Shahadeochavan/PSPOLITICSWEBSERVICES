package com.mkyong.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.nextech.pspolitics.model.SoicalWork;

public class SocialWorkData {
	public ArrayList<SoicalWork> getMeeting(Connection con)
			throws SQLException {
		ArrayList<SoicalWork> socialworkList = new ArrayList<SoicalWork>(); 
		PreparedStatement stmt = con
				.prepareStatement(" SELECT * FROM socialwork");      
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				SoicalWork socialWork = new SoicalWork();
				socialWork.setSocialInformation(rs.getString("socialInformation"));
				socialWork.setSocialDate(rs.getString("date"));
				socialWork.setSocialPhotos(rs.getString("socialworkImage"));
				socialworkList.add(socialWork);
		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return socialworkList;

	}
}
