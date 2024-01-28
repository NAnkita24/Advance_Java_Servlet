package Package1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet8 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter p=resp.getWriter();
		p.println("Welcome to servlet");

		String name=req.getParameter("name");
		String Password=req.getParameter("pass");
		String Email=req.getParameter("email");
		String gender=req.getParameter("gender");
		String Course=req.getParameter("course");
		String condition=req.getParameter("condition");

		if (condition!=null) {

			if(condition.equals("checked")) {
				p.println("<h2>Name : "+name+"</h2>");
				p.println("<h2>Password : "+Password+"/<h2>");
				p.println("<h2>Email : "+Email+"</h2>");
				p.println("<h2>gender : "+gender+"<h2>");
				p.println("<h2>Course : "+Course+"<h2>");

				RequestDispatcher rd=req.getRequestDispatcher("success");
				rd.forward(req, resp);
			}

			else {
				p.println("<h2>You have to accept terms and condition"+"/<h2>");

			}
		}
		else { 
			p.println("<h2>You have to accept terms and condition"+"/<h2>");

			RequestDispatcher rd=req.getRequestDispatcher("index8.html ");
			rd.include(req, resp);
		}

	}
}