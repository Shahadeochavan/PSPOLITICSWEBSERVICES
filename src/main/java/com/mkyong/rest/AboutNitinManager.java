package com.mkyong.rest;

import java.sql.Connection;
import java.util.ArrayList;
import com.mkyong.rest.AboutNitinData;
import com.nextech.pspolitics.model.AboutNitin;
import com.nextech.pspoltics.dao.Database;

public class AboutNitinManager {
	public ArrayList<AboutNitin> getAboutNitin(String language) throws Exception {
		ArrayList<AboutNitin> aboutNitinList = new ArrayList<AboutNitin>();
		Database db = new Database();
		Connection con = db.getConnection();
		AboutNitinData aboutNitinData = new AboutNitinData();
		aboutNitinList = aboutNitinData.getAboutNitinEn(con,language);
		System.out.println("I am in about nitin manager");
		return aboutNitinList;
	}
}