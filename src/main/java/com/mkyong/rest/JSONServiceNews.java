package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
@Path("/json/news")
public class JSONServiceNews {

	@GET
	@Path("/get")
	@Produces("application/json")
	public Newss getNewsInJSON() {
		System.out.println("getNewsInJSON...");
		Newss newss= new Newss();
		List<News> newslist = new ArrayList<News>();
		News news = new News();
		news.setName("Shahadeo Chavan");
		news.setDate("12/12/2016");
		news.setTime("12:00");
		news.setInformationofphots("Nitin Shelke Phots At Wadegon");
		newslist.add(news);
		newss.setNewss(newslist);
		return newss; 
	}

}
