package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.nextech.pspolitics.model.PersonalInfo;
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
		personalInfo.setImage("http://192.168.2.102:8080/PSPolitics/img/nitin10.jpg");
		personalInfo.setName("Nitin Shelke");
		personalInfo.setEducation("B.A.");
		personalInfo.setWorking("Farmer");
		personalInfo.setAddress("Wadegon");
		personalInfoList.add(personalInfo);
		personalInformation.setPersonalInfos(personalInfoList);

		return personalInformation; 
	}
}
