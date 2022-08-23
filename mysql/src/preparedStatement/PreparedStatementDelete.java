package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Step 1");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Step 2");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eample", "root", "1234");
		System.out.println("Step 3");
		PreparedStatement ps = con.prepareStatement(" delete from sname where id = 124 ");
		int rr =	ps.executeUpdate();
	
		
		System.out.println("the data is deleted succesfully "+rr);
		}

}
