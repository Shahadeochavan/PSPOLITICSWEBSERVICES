package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.nextech.pspolitics.model.Meeting;
import com.nextech.pspolitics.model.Meetings;
import com.nextech.pspolitics.model.PersonalInfo;
import com.nextech.pspolitics.model.PersonalInformation;
@Path("/json/personalinfo")
public class JSONServicePersonalInfo {
	@GET
	@Path("/get")
	@Produces("application/json; charset=utf-8")
	public String getPesonalInfo() {
		System.out.println("getPersonalInfo...");
		String personaInfo = null;
		PersonalInformation personalInformation=new PersonalInformation();
		try {
			ArrayList<PersonalInfo> personalInfoList = new ArrayList<PersonalInfo>();
			personalInfoList = new PersonalInfoManager().getpersonalInfo();
			personalInformation.setPersonalInfos(personalInfoList);
			Gson gson = new Gson();
			personaInfo = gson.toJson(personalInformation);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return personaInfo;
	}

}
