package com.mycompany.bsu_rfms;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class rf_dbconnection {
    
    //private constructor
    private rf_dbconnection() {
        try {
            //Step 2: Load MySQL Java driver
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
        
    private static rf_dbconnection instance = new rf_dbconnection();
    public static final String URL = "jdbc:mysql://localhost:3306/bsu-rfmonitoring";
    public static final String USER = "root";
    public static final String PASSWORD = "root";
    public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver"; 
     
     
    private Connection createConnection() {
 
        Connection connection = null;
        try {
            //Step 3: Establish Java MySQL connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Successfully Connected to the Database.");
            
        } catch (SQLException e) {
            System.out.println("ERROR: Unable to Connect to Database.");
            
        }
        
//        if (connection != null) {
//            System.out.println("You made it, take control your database now!");
//	} else {
//            System.out.println("Failed to make connection!");
//	}
        
        return connection;
    }   
     
    public static Connection getConnection() {
        return instance.createConnection();
    }
    
}
