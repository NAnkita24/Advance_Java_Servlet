package Package1;
	import java.io.IOException;
	import java.io.PrintWriter;

	import jakarta.servlet.ServletException;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;

	public class SuccessServlet extends HttpServlet{
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter p=resp.getWriter();
		p.println("Success Servlet");
		p.println("<h2>Register Successfully"+"<h2>");
}
}