package com.mkyong.rest;

import java.sql.Connection;
import java.util.ArrayList;
import com.nextech.pspolitics.model.PersonalInfo;
import com.nextech.pspoltics.dao.Database;

public class PersonalInfoManager {
	public ArrayList<PersonalInfo> getpersonalInfo() throws Exception {
		ArrayList<PersonalInfo> personalInfoList = new ArrayList<PersonalInfo>();
		Database db = new Database();
		Connection con = db.getConnection();
		PersonalInfoData personalInfoData = new PersonalInfoData();
		personalInfoList = personalInfoData.getPersonalInfo(con);
		return personalInfoList;
	}

}
