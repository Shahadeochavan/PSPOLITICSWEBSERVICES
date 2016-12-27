package com.mkyong.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.nextech.pspolitics.model.About;
import com.nextech.pspolitics.model.AboutNitin;

@Path("/json/aboutnitin")
public class JSONServiceAboutNitin {
	@GET
	@Path("/get")
	@Produces("application/json; charset=utf-8")
	public String getAboutNitin() {
		System.out.println("getaboutNitin...");
		
		String language = "EN";
		return getAboutNitinData(language);
	}

	@GET
	@Path("/mr/get")
	@Produces("application/json; charset=utf-8")
	public String getAboutNitinMr() {
		System.out.println("i am in marathi json");
		String language = "MR";
		return getAboutNitinData(language);
	}

	@GET
	@Path("/hn/get")
	@Produces("application/json; charset=utf-8")
	public String getAboutNitinHn() {
		System.out.println("i am in hindi json");
		String language = "HN";
		return getAboutNitinData(language);

	}
	
	public String getAboutNitinData(String language){
		String aboutNitin = null;
		About about = new About();
		try {
			ArrayList<AboutNitin> aboutNitinList = new ArrayList<AboutNitin>();
			aboutNitinList = new AboutNitinManager().getAboutNitin(language);
			about.setAboutNitins(aboutNitinList);
			Gson gson = new Gson();
			aboutNitin = gson.toJson(about);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return aboutNitin;
	}
}