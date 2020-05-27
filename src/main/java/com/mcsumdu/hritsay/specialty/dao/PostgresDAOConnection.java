package com.mcsumdu.hritsay.specialty.dao;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.*;
public abstract class PostgresDAOConnection implements DAOConnection {
    public static PostgresDAOConnection postgresDAOConnection;
    protected Connection connection;
    protected  PreparedStatement statement;
    protected  ResultSet resultSet;
    protected Driver driver;
    @Value("${db.url}")
    private String url;
    @Value("${db.login}")
    private String login;
    @Value("${db.password}")
    private String password;


    @Override
    public void connect() {
        try {
            try {
                Class clazz = Class.forName("org.postgresql.Driver");
                driver =(Driver) clazz.newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(url, login, password);
            if (connection.isClosed()) {
                System.out.println("Connection is closed!");
                /*
                 * Here will be logs.
                 * */
            }
        } catch (SQLException e) {
            e.printStackTrace();
            /* Here will be logs.
             */
        }
    }

    @Override
    public void disconnect() {
        try {
            if(connection != null) {
                connection.close();
            }
            if(resultSet != null) {
                resultSet.close();
            }
            if(statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




}
