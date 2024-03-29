package jdbc1;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Step2 {

	public static void main(String[] args) {
		// load and register
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establish the connection
//			String url="jdbc:mysql://localhost:3306/db1";
//			String user="root";
//			String pwd="root";
//		DriverManager.getConnection(url, user, pwd);
			DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?user=root&password=root");
			System.out.println("connection done");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
