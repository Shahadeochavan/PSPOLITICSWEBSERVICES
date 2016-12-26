package com.mkyong.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.nextech.pspolitics.model.PersonalInfo;

public class PersonalInfoData {
	public ArrayList<PersonalInfo> getPersonalInfo(Connection con)
			throws SQLException {
		ArrayList<PersonalInfo> personalInfoList = new ArrayList<PersonalInfo>();
		PreparedStatement stmt = con
				.prepareStatement(" SELECT * FROM PersonalInfo");
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				PersonalInfo personalInfo = new PersonalInfo();
				personalInfo.setName(rs.getString("name"));
				personalInfo.setAddress(rs.getString("address"));
				personalInfo.setEducation(rs.getString("education"));
				personalInfo.setWorking(rs.getString("working"));
				personalInfo.setImage(rs.getString("imageNitin"));
				personalInfoList.add(personalInfo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return personalInfoList;

	}

}
