package com.mkyong.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.nextech.pspolitics.model.Meeting;
import com.nextech.pspolitics.model.Meetings;

@Path("/json/meeting")
public class JSONServiceMeeting {

		@GET
		@Path("/get")
		@Produces("application/json; charset=utf-8")
		public  String getMeeting() {
			System.out.println("getMeeting...");
			String meeting = null;
			Meetings meetings=new Meetings();
			try {
				ArrayList<Meeting> meetingList = new ArrayList<Meeting>();
				meetingList = new MeetingManager().getMeeting();
				meetings.setMeetings(meetingList);
				Gson gson = new Gson();
				meeting = gson.toJson(meetings);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return meeting;
		}
		@GET
		@Path("/mr/get")
		@Produces("application/json; charset=utf-8")
		public  void getMeetingMr(){
			JSONServiceMeeting jsonServiceMeeting=new JSONServiceMeeting();
			jsonServiceMeeting.getMeeting();
			System.out.println("I am in mr");
			
		}

	}

