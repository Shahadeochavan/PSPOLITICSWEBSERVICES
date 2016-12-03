package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
@Path("/json/aboutnitin")
public class JSONServiceAboutNitin {
	@GET
	@Path("/get")
	@Produces("application/json")
	public AboutNitinShelke getAboutNitinInJSON() {
		System.out.println("getAboutNitinInJSON...");
		AboutNitinShelke aboutNitinShelke= new AboutNitinShelke();
		List<AboutNitin> aboutnitinList = new ArrayList<AboutNitin>();
		AboutNitin aboutNitin = new AboutNitin();
		aboutnitinList.add(aboutNitin);
		aboutNitinShelke.setAboutNitins(aboutnitinList);

		return aboutNitinShelke; 
	}
}
