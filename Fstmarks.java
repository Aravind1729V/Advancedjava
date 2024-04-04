package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Fstmarks {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2?user=root&password=root");
		Statement s = con.createStatement();
		ResultSet res = s.executeQuery("select * from student order by marks desc");
		while(res.next()) {
			System.out.println(res.getInt(1));
			System.out.println(res.getString("stdname"));
			System.out.println(res.getString(3));
			System.out.println(res.getString(4));
		}
		System.out.println("executed sucessfully");
		s.close();
		con.close();
	}
}
