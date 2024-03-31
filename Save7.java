package jdbc1;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Save7 {

	public static void main(String[] args) throws SQLException {
		Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		System.out.println("connection done");
		
	}

}
