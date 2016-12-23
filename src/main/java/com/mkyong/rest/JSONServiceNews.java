package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.nextech.pspolitics.model.Meeting;
import com.nextech.pspolitics.model.Meetings;
import com.nextech.pspolitics.model.News;
import com.nextech.pspolitics.model.Newss;
@Path("/json/news")
public class JSONServiceNews {

	@GET
	@Path("/get")
	@Produces("application/json; charset=utf-8")
	public String getNews() {
		System.out.println("getNews...");
		String news = null;
		Newss newss=new Newss();
		try {
			ArrayList<News> newsList = new ArrayList<News>();
			newsList = new NewsManager().getNews();
			newss.setNewss(newsList);
			Gson gson = new Gson();
			news = gson.toJson(newss);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return news;
	}


}
