package com.mkyong.rest;

import java.sql.Connection;
import java.util.ArrayList;
import com.mkyong.rest.AboutNitinShelke;
import com.nextech.pspolitics.model.AboutNitin;
import com.nextech.pspoltics.dao.Database;

public class AboutNitinManager {
	public ArrayList<AboutNitin> getAboutNitin() throws Exception {
		ArrayList<AboutNitin> aboutNitinList = new ArrayList<AboutNitin>();
		Database db = new Database();
		Connection con = db.getConnection();
		AboutNitinShelke access = new AboutNitinShelke();
		aboutNitinList = access.getAboutNitin(con);
		System.out.println("I am in about nitin manager");
		return aboutNitinList;
	}
}