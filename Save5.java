package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Save5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
		Statement s=con.createStatement();
		s.execute("update student set stdname='beesanna' where stdemail='buju@gmail.com'");
		s.close();
		con.close();
		System.out.println("data updated sucessfully");
	}

}
