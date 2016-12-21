package com.mkyong.rest;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.nextech.pspolitics.model.SocialWorks;
import com.nextech.pspolitics.model.SoicalWork;

@Path("/json/socialwork")
public class JSONServiceSocialWork {
	@GET
	@Path("/get")
	@Produces("application/json; charset=utf-8")
	public String getSocialWork() {
		System.out.println("getgetSocialWork...");
		String socialWork = null;
		SocialWorks socialWorks = new SocialWorks();
		try {
			ArrayList<SoicalWork> soicalWorksList = new ArrayList<SoicalWork>();
			soicalWorksList = new SocialWorkManager().getSocialWork();
			socialWorks.setSoicalWorks(soicalWorksList);
			Gson gson = new Gson();
			socialWork = gson.toJson(socialWorks);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return socialWork;
	}
}
