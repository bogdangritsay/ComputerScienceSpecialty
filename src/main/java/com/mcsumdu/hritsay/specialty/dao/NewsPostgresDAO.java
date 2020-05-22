package com.mcsumdu.hritsay.specialty.dao;

import com.mcsumdu.hritsay.specialty.models.News;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class NewsPostgresDAO extends PostgresDAOConnection {

    public List<News> getAllNews() {
        connect();
        List<News> news = new ArrayList<>();
        try {
            statement = connection.prepareStatement("SELECT * FROM SITE_NEWS");
            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                news.add(parseNews(resultSet));
            }
        } catch (SQLException e) {
            /*
            * LOGS
             */

        } finally {
            disconnect();
        }
        return news;
    }

    public boolean existsById(int id) {
        connect();
        String url = null;
        try {
            statement = connection.prepareStatement("SELECT * FROM URLS WHERE URL_ID = ?");
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                url = resultSet.getString("URL");
            }
        } catch (SQLException e) {
            /*
             * LOGS
             */

        } finally {
            disconnect();
        }
        return true;
    }


    private News parseNews(ResultSet resultSet) {
        News news = null;
        try {
            int id = resultSet.getInt("NEWS_ID");
            String title = resultSet.getString("TITLE");
            String shortDesc = resultSet.getString("SHORT_DESC");
            String newsText = resultSet.getString("NEWS_TEXT");
            Date date = resultSet.getDate("NEWS_DATE");
            int imgUrlId = resultSet.getInt("URL_IMG_ID");
            news = new News(id, title, shortDesc, newsText, imgUrlId, date);
            //System.out.println(news);
        } catch (SQLException e) {
            /*
            LOGS
             */
        }
        return news;
    }


}
