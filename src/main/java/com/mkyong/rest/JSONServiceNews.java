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
		news.setPhotoId("http://192.168.0.100:8080/PSPolitics/img/nitin.jpg");
		news.setPhotsNews("http://192.168.0.100:8080/PSPolitics/img/nature.jpg");
		news.setName("Shahadeo Chavan");
		news.setDate("12/12/2016");
		news.setTime("12:00");
		news.setInformationofphots("Nitin Shelke Phots At Wadegon");
		newslist.add(news);
		newss.setNewss(newslist);
		
		news = new News();
		news.setPhotoId("http://192.168.0.100:8080/PSPolitics/img/nitin2.jpg");
		news.setPhotsNews("http://192.168.0.100:8080/PSPolitics/img/nitin3.jpg");
		news.setName("Sunil Chavan");
		news.setDate("12/12/2016");
		news.setTime("12:00");
		news.setInformationofphots("Nitin Shelke Phots At Wadegon");
		newslist.add(news);
		newss.setNewss(newslist);
		
		news = new News();
		news.setPhotoId("http://192.168.0.100:8080/PSPolitics/img/nitin.jpg");
		news.setPhotsNews("http://192.168.0.100:8080/PSPolitics/img/nitin4.jpg");
		news.setName("Anil Chavan");
		news.setDate("12/12/2016");
		news.setTime("12:00");
		news.setInformationofphots("Nitin Shelke Phots At Wadegon");
		newslist.add(news);
		newss.setNewss(newslist);
		return newss; 
	}

}
