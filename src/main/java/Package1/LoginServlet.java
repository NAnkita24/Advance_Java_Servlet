package Package1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
@WebServlet(urlPatterns = "/login" ,name = "LoginServlet")
public class LoginServlet  extends HttpServlet{
 
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("Login");
		 PrintWriter P=resp.getWriter();
		 P.println("Servlet");
	}
}
