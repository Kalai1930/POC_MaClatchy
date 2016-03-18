package com.jdbcConnection;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	
	public static Connection getConnection() throws SQLException{

    	Connection con = null;
		Properties props = new Properties();
        try {
        	
        	InputStream inputStream = DBConnection.class.getClassLoader()
	                .getResourceAsStream("resources/DB_details.properties");
        	System.out.println(inputStream);
            props.load(inputStream);
            // load the Driver Class
            Class.forName(props.getProperty("DRIVER_CLASS"));
            // create the connection now
            con = DriverManager.getConnection(props.getProperty("URL"),
                    props.getProperty("USERNAME"),
                    props.getProperty("PASSWORD"));
            if(con != null){
            	System.out.println("DB connected");
            }
          
           
        } catch (IOException | ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       return con;
	}
	/*public static void main(String[] args) throws SQLException{
		getConnection();
	}*/

}
