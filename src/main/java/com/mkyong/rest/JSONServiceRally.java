package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.nextech.pspolitics.model.Rally;
import com.nextech.pspolitics.model.Rallys;
import com.nextech.pspolitics.model.VotingCenter;
import com.nextech.pspolitics.model.VotingCenters;

@Path("/json/rally")
public class JSONServiceRally {

	@GET
	@Path("/get")
	@Produces("application/json; charset=utf-8")
	public String getRally() {
		System.out.println("getRally...");
		String rally = null;
		Rallys rallys=new Rallys();
		try {
			ArrayList<Rally> rallyList = new ArrayList<Rally>();
			rallyList = new RallyManager().getRally();
			rallys.setRallys(rallyList);
			Gson gson = new Gson();
			rally = gson.toJson(rallys);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rally;
	}
}