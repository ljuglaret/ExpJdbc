package test;
import connection.ConnectionJDBC;

import java.sql.*;

public class Test {


	public static ResultSet resultatRequete(ConnectionJDBC conn, String requete) throws SQLException {
		return conn
				.getConnect()
				.createStatement()
				.executeQuery("Select * FROM expjdbc.employes");
	}
	
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/laure";
		String user="laure";
		String passwd = "";
		ConnectionJDBC test = new ConnectionJDBC(url, user,passwd);
		test.getInstance();
		ResultSet ensEmployes = resultatRequete(test, "Select * FROM expjdbc.employes");
		while(ensEmployes.next()) {
			System.out.println(ensEmployes.getString("firstname") + " " + ensEmployes.getString("lastname"));
		}
	}
}


