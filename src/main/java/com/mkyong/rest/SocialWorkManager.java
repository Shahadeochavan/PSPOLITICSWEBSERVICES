package com.mkyong.rest;

import java.sql.Connection;
import java.util.ArrayList;

import com.nextech.pspolitics.model.Meeting;
import com.nextech.pspolitics.model.SocialWorks;
import com.nextech.pspolitics.model.SoicalWork;
import com.nextech.pspoltics.dao.Database;

public class SocialWorkManager {
	public ArrayList<SoicalWork> getSocialWork() throws Exception {
		ArrayList<SoicalWork> socialWorkgList = new ArrayList<SoicalWork>();
		Database db = new Database();
		Connection con = db.getConnection();
		SocialWorkData meetingData = new SocialWorkData();
		socialWorkgList = meetingData.getMeeting(con);
		System.out.println("I am in about nitin manager");
		return socialWorkgList;
	}

}
