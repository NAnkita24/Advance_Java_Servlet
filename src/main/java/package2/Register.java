package package2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regi")
public class Register extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("uname");
		String email = req.getParameter("umail");
		String pass = req.getParameter("upass");
		
		PrintWriter out = resp.getWriter();
		out.print(name+" "+email+" "+pass);
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/register", "root", "root");
			PreparedStatement ptst =con.prepareStatement("insert into form (name,email,password) values (?,?,?)");
			ptst.setString(1, name);
			ptst.setString(2, email);
			ptst.setString(3, pass);
			ptst.execute();
			out.print("Registered Succesfully");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			out.print(e);
		} catch (SQLException e) {
			e.printStackTrace();
			out.print(e);
		}
		
		
	}

}
