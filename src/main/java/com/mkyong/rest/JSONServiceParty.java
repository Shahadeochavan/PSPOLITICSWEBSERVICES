package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.nextech.pspolitics.model.Party;
@Path("/json/party")
public class JSONServiceParty {
	
	@GET
	@Path("/get")
	@Produces("application/json")
	public Partys getPartyInJSON() {
		System.out.println("getPartyInJSON...");
		Partys partys= new Partys();
		List<Party> partyList = new ArrayList<Party>();
		Party party = new Party();
		party.setPartyImage("http://192.168.2.102:8080/PSPolitics/img/bjp.jpg");
		party.setPersonImage("http://192.168.2.102:8080/PSPolitics/img/nitin.jpg");
		party.setPersonName("Nitin Shelke");
		party.setDesgination("Nagar Sevak");
		party.setPartyName("Bharatiya janta party");
		partyList.add(party);
		partys.setPartys(partyList);
		return partys; 
	}

}

	