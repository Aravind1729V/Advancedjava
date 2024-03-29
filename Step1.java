package jdbc1;

//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
//import com.mysql.cj.jdbc.*;


public class Step1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load and Register -------driver
		//2 ways
		//Class.forName("com.mysql.cj.jdbc.Driver");
//		Driver d=new com.mysql.cj.jdbc.Driver();
//		DriverManager.registerDriver(d);
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("done");
	}

}
