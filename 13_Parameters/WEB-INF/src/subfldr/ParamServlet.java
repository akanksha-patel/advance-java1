package subfldr;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ParamServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
							throws IOException,ServletException{
	
		String uname = request.getParameter("nm");
		String passw = request.getParameter("pw");

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("The User name is: "+uname+"<br />");
		pw.write("And The Password is: "+passw);

		pw.flush();
		pw.close();
	}
}