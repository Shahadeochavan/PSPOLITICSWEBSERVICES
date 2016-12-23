package com.mkyong.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.nextech.pspolitics.model.AboutNitin;

public class AboutNitinShelke {
	public ArrayList<AboutNitin> getAboutNitin(Connection con)
			throws SQLException {
		ArrayList<AboutNitin> aboutNitinList = new ArrayList<AboutNitin>(); 
		PreparedStatement stmt = con
				.prepareStatement(" SELECT * FROM aboutnitin");      
		ResultSet rs = stmt.executeQuery();
	
		try {
			while (rs.next()) {
				AboutNitin aboutNitin = new AboutNitin();
				aboutNitin.setAboutNitin(rs.getString("aboutNitin"));
				aboutNitin.setNitinImage("http://192.168.2.102:8080/PSPolitics/img/nitin.jpg");
				aboutNitinList.add(aboutNitin);
			
		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aboutNitinList;

	}
}