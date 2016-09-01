package subfldr;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ParamServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
							throws IOException,ServletException{
	
		String food1 = request.getParameter("fd1");
		String food2 = request.getParameter("fd2");

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("Ur first choice: "+food1+"<br />");
		pw.write("Ur Second choice: "+food2);

		pw.flush();
		pw.close();
	}
}