package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Save3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root","root");
		Statement s=con.createStatement();
		s.execute("insert into emp values(1,'aravind',100000,6300142062)");
		s.close();
		con.close();
		System.out.println("sucessfully inserted");
	}

}
