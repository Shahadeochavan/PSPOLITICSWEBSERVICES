package com.mkyong.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nextech.pspolitics.model.Party;

public class PartyData {
	public ArrayList<Party> getParty(Connection con,String language)
			throws SQLException {
		String columnperson = "personName_english";
		String   columnparty = "partyName_english";
		 String     columndesgination = "Desgination_english";
	         String  	columnabout = "AboutParty_English";
		if(language == "MR"){
			columnperson = "personName_marathi";
			columnparty = "partyName_marathi";
			columndesgination = "Desgination_marathi";
			columnabout = "AboutParty_Marathi";
		}else if(language == "HN"){
			columnperson = "personName_hindi";
			columnparty = "partyName_hindi";
			columndesgination = "Desgination_hindi";
			columnabout = "AboutParty_hindi";
		}else{
			columnperson =  "personName_english";
			columnparty = "partyName_english";
	        columndesgination = "Desgination_english";
	        columnabout = "AboutParty_English";
		}
		ArrayList<Party> partyList = new ArrayList<Party>();
		PreparedStatement stmt = con
				.prepareStatement(" SELECT " + columnperson +"," + columnparty +","+ columndesgination +"," +columnabout+ " ,personImage,partyImage FROM party");
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Party party = new Party();
				party.setPersonName(rs.getString(columnperson));
				party.setAboutParty(rs.getString(columnabout));
				party.setPartyName(rs.getString(columnparty));
				party.setDesgination(rs.getString(columndesgination));
				party.setPersonImage(rs.getString("personImage"));
				party.setPartyImage(rs.getString("partyImage"));
				partyList.add(party);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return partyList;

	}
}	
