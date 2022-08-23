package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class delete {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("Step 1");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Step 2");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eample", "root", "1234");
		System.out.println("Step 3");
		Statement stmt = con.createStatement();
		String query = "delete from sname where id = 123";
		
		int rr = stmt.executeUpdate(query);
		System.out.println("Step 4");
			System.out.println("the data is inserted succesfully "+rr);
	
}

}