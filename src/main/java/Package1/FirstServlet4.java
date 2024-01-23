package Package1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstServlet4 implements Servlet {

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("create object");		
	}

	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Ankita Omkar</h1>");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("going to destroy");
	}
}
