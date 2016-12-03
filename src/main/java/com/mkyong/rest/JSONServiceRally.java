package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/json/rally")
public class JSONServiceRally {

	@GET
	@Path("/get")
	@Produces("application/json")
	public Rallys getRallyInJSON() {
		System.out.println("getRallyJson...");
		Rallys rallys= new Rallys();
		List<Rally> rallyList = new ArrayList<Rally>();
		Rally rally = new Rally();
		rally.setStartPoint("pune station");
		rally.setEndPoint("shivaji Nagar");
		rally.setDate("12/12/2016");
		rally.setStartTime("10:00");
		rally.setEndTime("12:00");
		rally.setRallyDay("Sunday");
		rallyList.add(rally);
		rallys.setRallys(rallyList);
		return rallys; 
	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response createRallyInJSON(Rally rally) {

		String result = "Rally created : " + rally;
		return Response.status(201).entity(result).build();
		
	}
	}

