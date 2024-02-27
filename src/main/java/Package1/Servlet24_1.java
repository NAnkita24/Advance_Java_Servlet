package Package1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet24_1 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	PrintWriter out = resp.getWriter();

	String name=req.getParameter("uname");
	out.println("<h1>your name is"+name+"</h1>");
//	out.println("<a href='servlet2?user="+name+"'>Go to second servlet</a>");
	
	out.println("<form action='servlet2'>"
			+"<input type='hidden' name='uname' value='"+name+"'/>"
			+"<button> Go to second servlet</button>"
			+ "</form>");	
}
}
