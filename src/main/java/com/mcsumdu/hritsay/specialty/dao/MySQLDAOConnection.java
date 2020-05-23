package com.mcsumdu.hritsay.specialty.dao;

import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public abstract class MySQLDAOConnection implements DAOConnection {
    public static MySQLDAOConnection mySQLDAOConnection;
    protected Connection connection;
    protected PreparedStatement statement;
    protected ResultSet resultSet;
    protected Driver driver;




    @Override
    public void connect() {
        try {
            try {
                Class clazz = Class.forName("org.mariadb.jdbc.Driver");
                driver =(Driver) clazz.newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection("mysql.zzz.com.ua/raidinc", "raidinc", "plGQWHXDCLh2wujt");
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
