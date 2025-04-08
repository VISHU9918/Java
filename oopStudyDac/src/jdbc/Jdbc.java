package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/database_Name"; 
        String username = "root"; 
        String password = "*******"; 
        
        // Initialize the connection
        Connection connection = null;

        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            connection = DriverManager.getConnection(url, username, password);
            
            
            System.out.println("Connected to the database successfully!");

        } catch (SQLException | ClassNotFoundException e) {
         
            e.printStackTrace();
        } finally {
            
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
