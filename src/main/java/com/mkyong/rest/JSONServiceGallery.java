package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/json/gallery")
public class JSONServiceGallery {
	@GET
	@Path("/get")
	@Produces("application/json")
	public Gallerys getGalleryInJSON() {
		System.out.println("getGalleryInJSON...");
		Gallerys gallerys= new Gallerys();
		List<Gallery> galleryList = new ArrayList<Gallery>();
		Gallery gallery = new Gallery();
		galleryList.add(gallery);
		gallerys.setGalleries(galleryList);

		return gallerys; 
	}

}
