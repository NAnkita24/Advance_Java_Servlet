package package2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.jdt.internal.compiler.env.IModule.IService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
@MultipartConfig
@WebServlet("/regi")
public class Register extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("uname");
		String email = req.getParameter("umail");
		String pass = req.getParameter("upass");
		Part part=req.getPart("image");
		String filename=part.getSubmittedFileName();
		PrintWriter out = resp.getWriter();

		out.println(filename);
		out.print(name+" "+email+" "+pass);
		
		try {
			Thread.sleep(300);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/register", "root", "root");
			PreparedStatement ptst =con.prepareStatement("insert into form (name,email,password,imagename) values (?,?,?,?)");
			ptst.setString(1, name);
			ptst.setString(2, email);
			ptst.setString(3, pass);
			ptst.setString(4, filename);

			ptst.execute();
			out.print("done");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			out.print(e);
		} catch (SQLException e) {
			e.printStackTrace();
			out.print(e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		InputStream fi=part.getInputStream();
		byte[]data=new byte[fi.available()];
		
		fi.read(data);
		
		String path = "D:\\Java Practice\\Core JAVA Concepts\\First\\src\\main\\webapp\\Images"+File.separator+filename;
		FileOutputStream fo =new FileOutputStream(path);
		fo.write(fi.read(data));
	}

}
