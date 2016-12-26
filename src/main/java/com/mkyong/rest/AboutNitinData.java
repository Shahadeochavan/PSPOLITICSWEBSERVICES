package com.mkyong.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nextech.pspolitics.model.AboutNitin;

public class AboutNitinData {

	public ArrayList<AboutNitin> getAboutNitinEn(Connection con)
			throws SQLException {
		ArrayList<AboutNitin> aboutNitinList = new ArrayList<AboutNitin>();
		JSONServiceAboutNitin jsonServiceAboutNitin=new JSONServiceAboutNitin();
		String getAbout;
		if (jsonServiceAboutNitin.getAboutNitin() != null) {
			PreparedStatement stmt = con
					.prepareStatement(" SELECT about_nitin_english,about_nitin_image FROM aboutnitin");
			ResultSet rs = stmt.executeQuery();
			try {
				while (rs.next()) {
					AboutNitin aboutNitin = new AboutNitin();
					aboutNitin.setAboutNitin(rs
							.getString("about_nitin_english"));
					aboutNitin.setNitinImage(rs.getString("about_nitin_image"));
					aboutNitinList.add(aboutNitin);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if (jsonServiceAboutNitin.getAboutNitinMr()) {
			PreparedStatement stmt = con
					.prepareStatement(" SELECT about_nitin_marathi,about_nitin_image FROM aboutnitin");
			ResultSet rs = stmt.executeQuery();
			try {
				while (rs.next()) {
					AboutNitin aboutNitin = new AboutNitin();
					aboutNitin.setAboutNitin(rs
							.getString("about_nitin_marathi"));
					aboutNitin.setNitinImage(rs.getString("about_nitin_image"));
					aboutNitinList.add(aboutNitin);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if () {
			PreparedStatement stmt = con
					.prepareStatement(" SELECT about_nitin_hindi,about_nitin_image FROM aboutnitin");
			ResultSet rs = stmt.executeQuery();
			try {
				while (rs.next()) {
					AboutNitin aboutNitin = new AboutNitin();
					aboutNitin.setAboutNitin(rs
							.getString("about_nitin_hindi"));
					aboutNitin.setNitinImage(rs.getString("about_nitin_image"));
					aboutNitinList.add(aboutNitin);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return aboutNitinList;

	}

}