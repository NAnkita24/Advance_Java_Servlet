package Package1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.jar.Attributes.Name;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet ("/omkar") 

public class Servlet2  extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		
		Cookie [] cookies=req.getCookies();
		boolean f=false;
		String name="";
		
		if (cookies==null) {
			pw.println("<h1>you are a new user so go to home page</h1>");
			return;
		}
		else {
			for(Cookie c  :cookies ) {
				
				String str=c.getName();
				if (str.equals("username")) {
					f=true;
					name=c.getValue();
					
				}
			}
		}
		
		if (f) {
		
		pw.println("<h1> Hii ,"+name+"Welcome  back to website </h1>");
		pw.println("<h1> Thank you</h1>");
		}
}
}