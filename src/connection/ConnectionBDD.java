package connection;

import java.sql.*;

public class Connection {


	  private static String url = "jdbc:postgresql://localhost:5432/laure";
	  private static String user = "laure";
	  private static String passwd = "tournesol";
	  private static java.sql.Connection connect;

	  public static Connection getInstance(){
	    if(connect == null){
	      try {
	        connect = DriverManager(url, user, passwd);
	       
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }      
	    return connect;
	  }
	  
	}


