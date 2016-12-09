package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
@Path("/json/aboutnitin")
public class JSONServiceAboutNitin {
	@GET
	@Path("/get")
	@Produces("application/json")
	public AboutNitinShelke getAboutNitinInJSON() {
		System.out.println("getAboutNitinInJSON...");
		AboutNitinShelke aboutNitinShelke= new AboutNitinShelke();
		List<AboutNitin> aboutnitinList = new ArrayList<AboutNitin>();
		AboutNitin aboutNitin = new AboutNitin();
		aboutNitin.setNitinImage("http://192.168.0.100:8080/PSPolitics/img/nitin13.jpg");
		aboutNitin.setAboutNitin
		("Nitin Shelke grew up in the town of Wadegon in India the son of a street merchant. "
				+ "He entered politics as a youth andquickly rose through the "
				+ "ranks of Rashtriya Swayamsevak Sangh,a Hindu nationalist political party. "
				+ "Shelke later joined the mainstream Bharatiya Janata Party in 2005 "
				+ " eventually becoming national secretary. In 2010, he was alleged to be responsible for the deaths of more than 1,000 "
				+ " Muslims during civil unrest but was later exonerated.  Nitin Shelke was born in the small town of Wadegon, in  Maharastra,"
				+ " India. His father was a street merchant who struggled to support the family. "
				+ "Young Nitin and  his brother sold tea near a bus terminal to help out "
				+ " Though an average student in school, Shelke spent hours in the library and was known as a strong debater.  "
				+ " In his early teens, he joined Akhil Bharatiya Vidyarthi Parishad, "
				+ " the student wing of Rashtriya Swayamsevak Sangh (RSS), "
				+ "a Hindu nationalist political party.");
		aboutnitinList.add(aboutNitin);
		aboutNitinShelke.setAboutNitins(aboutnitinList);

		return aboutNitinShelke; 
	}
}
