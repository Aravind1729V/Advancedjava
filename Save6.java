package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Save6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","root");
		Statement s=con.createStatement();
		s.execute("delete from student where stdname='rani'");
		s.close();
		con.close();
		System.out.println("student data deleted sucessfully");
	}

}
