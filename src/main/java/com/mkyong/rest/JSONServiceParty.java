package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.nextech.pspolitics.model.Meeting;
import com.nextech.pspolitics.model.Meetings;
import com.nextech.pspolitics.model.Party;
import com.nextech.pspolitics.model.Partys;

@Path("/json/party")
public class JSONServiceParty {

	@GET
	@Path("/get")
	@Produces("application/json; charset=utf-8")
	public String getParty() {
		System.out.println("getParty...");
		String party = null;
		Partys partys = new Partys();
		try {
			ArrayList<Party> partyList = new ArrayList<Party>();
			partyList = new PartyManager().getParty();
			partys.setPartys(partyList);
			Gson gson = new Gson();
			party = gson.toJson(partys);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return party;
	}

}
