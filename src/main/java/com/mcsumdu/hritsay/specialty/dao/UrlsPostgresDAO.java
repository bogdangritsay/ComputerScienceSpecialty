package com.mcsumdu.hritsay.specialty.dao;


import java.sql.SQLException;

public class UrlsPostgresDAO extends PostgresDAOConnection {




    public String getUrlById(int id) {
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
        return url;
    }
}
