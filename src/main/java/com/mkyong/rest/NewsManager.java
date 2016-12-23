package com.mkyong.rest;

import java.sql.Connection;
import java.util.ArrayList;
import com.nextech.pspolitics.model.News;
import com.nextech.pspoltics.dao.Database;

public class NewsManager {
	public ArrayList<News> getNews() throws Exception {
		ArrayList<News> newsList = new ArrayList<News>();
		Database db = new Database();
		Connection con = db.getConnection();
		NewsData newsData = new NewsData();
		newsList = newsData.getNews(con);
		return newsList;
	}

}
