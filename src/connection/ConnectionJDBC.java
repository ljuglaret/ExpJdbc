package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {


	private String url;
	private String user;
	private String passwd;
	private Connection connect;

	public ConnectionJDBC(String url , String user , String passwd) {
		this.url = url;
		this.user = user;
		this.passwd = passwd;
	}

	public  Connection getInstance(){
		if(connect == null){
			try {
				connect = DriverManager.getConnection(url, user,passwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}      
		return connect;
	}

	public Connection getConnect() {
		return connect;
	}
}
