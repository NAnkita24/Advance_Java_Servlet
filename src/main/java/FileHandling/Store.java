package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Store {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
		
		File f=new File("sampleimage.jpg");
		FileInputStream fis = new FileInputStream(f);
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "root");
		PreparedStatement ptst=con.prepareStatement("insert into data1(file_name,file) values(?,?)");
		
		ptst.setString(1, f.getName());
		ptst.setBinaryStream(2, fis);
		ptst.execute();
		
		System.out.println("Operation Completed");
	}
}

