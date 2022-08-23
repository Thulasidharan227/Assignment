package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PreparedStatementRead {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		System.out.println("Step 1");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Step 2");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eample", "root", "1234");
		System.out.println("Step 3");
		PreparedStatement ps = con.prepareStatement("select * from sname");
		
		ResultSet rs =	ps.executeQuery();
		
		System.out.println("Step 4");
		while (rs.next()) {
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("pass"));
		}
	}
}
