package com.mkyong.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.nextech.pspolitics.model.Gallery;
import com.nextech.pspolitics.model.Gallerys;

@Path("/json/gallery")
public class JSONServiceGallery {
	@GET
	@Path("/get")
	@Produces("application/json; charset=utf-8")
	public String getGallery() {
		System.out.println("getGallery...");
		String gallery = null;
		Gallerys gallerys=new Gallerys();
		try {
			ArrayList<Gallery> galleryList = new ArrayList<Gallery>();
			galleryList = new GalleryManager().getGallery();
			gallerys.setGalleries(galleryList);
			Gson gson = new Gson();
			gallery = gson.toJson(gallerys);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gallery;
	}

}
