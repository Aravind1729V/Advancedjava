package jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Fetch1 {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2?user=root&password=root");
		Statement statement=con.createStatement();
		ResultSet result = statement.executeQuery("select * from student");
		while(result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getString("marks"));
			System.out.println(result.getString("email"));
		}
		statement.close();
		con.close();
	}

}
