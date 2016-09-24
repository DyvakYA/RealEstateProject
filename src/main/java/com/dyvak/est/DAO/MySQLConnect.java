package com.dyvak.est.DAO;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Dyvak on 21.09.2016.
 */
public class MySQLConnect {

    private static final String URL= "jdbc:mysql://localhost:3306/mydbtest?autoReconnect=true&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD= "root";


    public static void main (String[] args) throws SQLException {

        Connection connection;

        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = (Statement) connection.createStatement();

            if (!connection.isClosed()){
                System.out.println("Good connection");
            }

            //statement.execute("SELECT");





            connection.close();

            if (connection.isClosed()){
                System.out.println("Slose connection");
            }
        } catch (SQLException e) {
            System.err.println("Not find class driver");
        }
    }
}