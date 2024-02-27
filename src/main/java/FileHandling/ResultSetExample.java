package FileHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetExample {
	public static void main(String[] args) throws SQLException {
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from students");
		
		while (rs.next()) {
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getInt(5));
			System.out.println();
		}
		
	}
}
