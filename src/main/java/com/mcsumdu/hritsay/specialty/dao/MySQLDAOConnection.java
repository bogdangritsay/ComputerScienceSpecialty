package com.mcsumdu.hritsay.specialty.dao;

import java.sql.*;

public abstract class MySQLDAOConnection implements DAOConnection {
    public static MySQLDAOConnection mySQLDAOConnection;
    private Connection connection;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private Driver driver;




    @Override
    public void connect() {
       /* try {


            try {
                *//*Class clazz = Class.forName("org.postgresql.Driver");*//*
               // driver = new Pos
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "postgres", "356897-Bnm");
            if (connection.isClosed()) {
                System.out.println("Connection is closed!");
                *//*
                * Here will be logs.
                * *//*
            }
        } catch (SQLException e) {
            *//*
            * Here will be logs.
            *//*
        }*/
    }

    @Override
    public void disconnect() {

    }

}
