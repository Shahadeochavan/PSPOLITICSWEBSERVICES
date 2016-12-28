package com.mkyong.rest;

import java.sql.Connection;
import java.util.ArrayList;

import com.nextech.pspolitics.model.Party;
import com.nextech.pspoltics.dao.Database;

public class PartyManager {
	public ArrayList<Party> getParty(String language) throws Exception {
		ArrayList<Party> partyList = new ArrayList<Party>();
		Database db = new Database();
		Connection con = db.getConnection();
		PartyData partyData = new PartyData();
		partyList = partyData.getParty(con,language);
		System.out.println("I am in about nitin manager");
		return partyList;
	}

}
