package com.mkyong.rest;

import java.sql.Connection;
import java.util.ArrayList;
import com.nextech.pspolitics.model.Meeting;
import com.nextech.pspoltics.dao.Database;

public class MeetingManager {
	public ArrayList<Meeting> getMeeting() throws Exception {
		ArrayList<Meeting> meetingList = new ArrayList<Meeting>();
		Database db = new Database();
		Connection con = db.getConnection();
		MeetingData meetingData = new MeetingData();
		meetingList = meetingData.getMeeting(con);
		System.out.println("I am in about nitin manager");
		return meetingList;
	}

}
