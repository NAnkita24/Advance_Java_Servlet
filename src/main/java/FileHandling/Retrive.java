package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retrive {
	public static void main(String[] args) throws SQLException, IOException {
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from data1 where id='2'");
		
		File file = new File("sample1.pdf");
		FileOutputStream fos =new FileOutputStream(file);
		
//		Blob blob = rs.getBlob(3);
//		byte b[] = blob.getBytes(1, (int) blob.length());
//
//		for (int i = 0; i < b.length; i++) {
//			fos.write(  b[i]);
//		}
		
		Blob blob;
		byte b [] = null;
		
		while (rs.next()) {
			blob = rs.getBlob(3);
			b = blob.getBytes(1, (int) blob.length());
		}
		
		fos.write(b);
		
		System.out.println("Done");
	}
}
