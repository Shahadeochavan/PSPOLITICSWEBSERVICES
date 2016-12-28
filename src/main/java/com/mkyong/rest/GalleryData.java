package com.mkyong.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nextech.pspolitics.model.Gallery;

public class GalleryData {
	public ArrayList<Gallery> getGallery(Connection con)
			throws SQLException {
		ArrayList<Gallery> galleryList = new ArrayList<Gallery>(); 
		PreparedStatement stmt = con
				.prepareStatement(" SELECT * FROM gallery");      
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				Gallery gallery = new Gallery();
				gallery.setImages(rs.getString("images"));
				gallery.setTitle(rs.getNString("title"));
				galleryList.add(gallery);
		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return galleryList;

	}
}
