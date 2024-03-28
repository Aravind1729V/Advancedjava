package jdbc1;

public class Step1 {

	public static void main(String[] args) throws ClassNotFoundException {
		//load and Register -------driver
		//2 ways
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("done");
	}

}
