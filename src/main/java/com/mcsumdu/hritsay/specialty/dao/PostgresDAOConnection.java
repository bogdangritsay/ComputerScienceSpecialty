package com.mcsumdu.hritsay.specialty.dao;


import java.sql.*;

public abstract class PostgresDAOConnection implements DAOConnection {
    public static PostgresDAOConnection postgresDAOConnection;
    protected Connection connection;
    protected  PreparedStatement statement;
    protected  ResultSet resultSet;
    protected Driver driver;


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
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/comp_science_db", "postgres", "356897-Bnm");
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

    }




}
