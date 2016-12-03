package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/json/meeting")
public class JSONServiceMeeting {

		@GET
		@Path("/get")
		@Produces("application/json")
		public Meetings getMeetingInJSON() {
			System.out.println("getMeetingJson...");
			Meetings meetings= new Meetings();
			List<Meeting> meetinglist = new ArrayList<Meeting>();
			Meeting meeting = new Meeting();
			meeting.setMeetingPersonName("Nitin Shleke");
			meeting.setMeetingDate("12/12/2016");
			meeting.setMeetingDay("Sunday");
			meeting.setMeetingStartTime("11:10 AM");
			meeting.setMeetingEndTime("01:00");
			meeting.setMeetingLocation("Shirur");
			meetinglist.add(meeting);
			meetings.setMeeting(meetinglist);
			return meetings; 
		}

	}

