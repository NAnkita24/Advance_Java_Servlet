package Package1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondServlet5  extends GenericServlet{
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet using generic");
		resp.setContentType("text/html");
		PrintWriter p=resp.getWriter();
		p.println("Second Servlet");
		p.println("<h1>Second Servlet</h1>");
	}

}
