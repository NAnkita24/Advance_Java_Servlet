package Package1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet ("/Servlet1")
public class Servlet1  extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		String name=req.getParameter("name");
		pw.println("<h1> Hii ,"+name+" Welcome to webpage </h1>");
		pw.println("<h1><a href='omkar'>Go to Servlet </a></h1>");
		
		Cookie c=new Cookie("username", name);
		resp.addCookie(c);
		}
}