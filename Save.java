package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Save {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/db1";
		String user="root";
		String pwd="root";
		Connection con	=DriverManager.getConnection(url, user, pwd);
		Statement s=con.createStatement();
		s.execute("insert into table1 value(2,'V ARAVIND',22)");
		s.close();
		con.close();
		System.out.println("insereted");

	}

}
