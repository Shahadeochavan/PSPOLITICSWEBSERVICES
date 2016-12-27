package com.mkyong.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nextech.pspolitics.model.AboutNitin;

public class AboutNitinData {
	public ArrayList<AboutNitin> getAboutNitinEn(Connection con,String language)
			throws SQLException {
		String column = "about_nitin_english";
		if(language == "MR"){
			column = "about_nitin_marathi";
		}else if(language == "HN"){
			column = "about_nitin_hindi";
		}else{
			column = "about_nitin_english";
		}
		ArrayList<AboutNitin> aboutNitinList = new ArrayList<AboutNitin>();
		PreparedStatement stmt = con
				.prepareStatement(" SELECT " + column +" ,about_nitin_image FROM aboutnitin");
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				AboutNitin aboutNitin = new AboutNitin();
				aboutNitin.setAboutNitin(rs.getString(column));
				aboutNitin.setNitinImage(rs.getString("about_nitin_image"));
				aboutNitinList.add(aboutNitin);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aboutNitinList;

	}
}