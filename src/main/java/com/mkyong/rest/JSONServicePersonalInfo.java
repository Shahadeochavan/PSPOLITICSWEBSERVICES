package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
@Path("/json/personalinfo")
public class JSONServicePersonalInfo {
	@GET
	@Path("/get")
	@Produces("application/json")
	public PersonalInformation getPersonalInJSON() {
		System.out.println("getPersonalInJSON...");
		PersonalInformation personalInformation= new PersonalInformation();
		List<PersonalInfo> personalInfoList = new ArrayList<PersonalInfo>();
		PersonalInfo personalInfo = new PersonalInfo();
		personalInfoList.add(personalInfo);
		personalInformation.setPersonalInfos(personalInfoList);

		return personalInformation; 
	}
}