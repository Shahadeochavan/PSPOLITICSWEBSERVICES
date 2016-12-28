package com.mkyong.rest;

import java.sql.Connection;
import java.util.ArrayList;

import com.nextech.pspolitics.model.Gallery;
import com.nextech.pspoltics.dao.Database;

public class GalleryManager {
	public ArrayList<Gallery> getGallery() throws Exception {
		ArrayList<Gallery> galleryList = new ArrayList<Gallery>();
		Database db = new Database();
		Connection con = db.getConnection();
		GalleryData galleryData = new GalleryData();
		galleryList = galleryData.getGallery(con);
		System.out.println("I am in about nitin manager");
		return galleryList;
	}
}
