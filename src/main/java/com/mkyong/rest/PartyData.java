package com.mkyong.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.nextech.pspolitics.model.Party;

public class PartyData {
	public ArrayList<Party> getParty(Connection con) throws SQLException {
		ArrayList<Party> partyList = new ArrayList<Party>();
		PreparedStatement stmt = con.prepareStatement(" SELECT * FROM party");
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Party party = new Party();
				party.setPersonImage("http://192.168.2.102:8080/PSPolitics/img/nitin4.jpg");
				party.setPartyImage("http://192.168.2.102:8080/PSPolitics/img/bjp.jpg");
				party.setPersonName(rs.getString("personName"));
				party.setPartyName(rs.getString("partyName"));
				party.setDesgination(rs.getString("Desgination"));
				partyList.add(party);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return partyList;

	}

}
