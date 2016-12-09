package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
@Path("/json/socialwork")
public class JSONServiceSocialWork {
	@GET
	@Path("/get")
	@Produces("application/json")
	public SocialWorks getSocialWorkInJSON() {
		System.out.println("getSocialWorkInJSON...");
		SocialWorks socialWorks= new SocialWorks();
		List<SoicalWork> socialWorkList = new ArrayList<SoicalWork>();
		SoicalWork socilaWork = new SoicalWork();
		socilaWork.setSocialPhotos("http://192.168.0.100:8080/PSPolitics/img/social.jpg");
		socilaWork.setSocialDate("12/12/2016");
		socilaWork.setSocialInformation("Tree Plantation");
		socialWorkList.add(socilaWork);
		socialWorks.setSoicalWorks(socialWorkList);
		
		socilaWork = new SoicalWork();
		socilaWork.setSocialPhotos("http://192.168.0.100:8080/PSPolitics/img/social.jpg");
		socilaWork.setSocialDate("12/12/2016");
		socilaWork.setSocialInformation("Tree Plantation");
		socialWorkList.add(socilaWork);
		socialWorks.setSoicalWorks(socialWorkList);
		
		socilaWork = new SoicalWork();
		socilaWork.setSocialPhotos("http://192.168.0.100:8080/PSPolitics/img/social.jpg");
		socilaWork.setSocialDate("12/12/2016");
		socilaWork.setSocialInformation("Tree Plantation");
		socialWorkList.add(socilaWork);
		socialWorks.setSoicalWorks(socialWorkList);
		
		return socialWorks; 
	}


}
