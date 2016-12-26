package com.mkyong.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.nextech.pspolitics.model.News;

public class NewsData {
	public ArrayList<News> getNews(Connection con) throws SQLException {
		ArrayList<News> newsList = new ArrayList<News>();
		PreparedStatement stmt = con.prepareStatement(" SELECT * FROM news");
		ResultSet rs = stmt.executeQuery();
		try {
			while (rs.next()) {
				News news = new News();
				news.setPhotoId(rs.getString("photoId"));
				news.setName(rs.getString("name"));
				news.setDate(rs.getString("date"));
				news.setTime(rs.getString("time"));
				news.setInformationofphots(rs.getString("informationofphots"));
				news.setPhotsNews(rs.getString("photsNews"));
				newsList.add(news);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return newsList;

	}
}
