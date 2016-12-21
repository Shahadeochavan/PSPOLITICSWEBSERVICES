package com.mkyong.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.nextech.pspolitics.model.Meeting;

public class MeetingData {
	public ArrayList<Meeting> getMeeting(Connection con)
			throws SQLException {
		ArrayList<Meeting> meetingList = new ArrayList<Meeting>(); 
		PreparedStatement stmt = con
				.prepareStatement(" SELECT * FROM meeting");      
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Meeting meeting = new Meeting();
				meeting.setMeetingPersonName(rs.getString("meetingPersonName"));
				meeting.setMeetingDate(rs.getString("meetingDate"));
				meeting.setMeetingDay(rs.getString("meetingDay"));
				meeting.setMeetingLocation(rs.getString("meetingLocation"));
				meeting.setMeetingStartTime(rs.getString("meetingStartTime"));
				meeting.setMeetingEndTime(rs.getString("meetingEndTime"));
				meetingList.add(meeting);
		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return meetingList;

	}
}
