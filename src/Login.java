import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet {
  public void service(HttpServletRequest req,HttpServletResponse resp)
            throws ServletException, IOException
	{
	    resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	    out.println("<h1>Hello World!</h1>");
	}
}