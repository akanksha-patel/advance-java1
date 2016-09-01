package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class InitParam2Servlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
							throws IOException,ServletException{
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		ServletConfig cnf = getServletConfig();
		String eml = cnf.getInitParameter("mngEml");
				
		pw.print("Another Servlet - The Manager Email is: <h3>"+eml+"</h3>");

		pw.flush();
		pw.close();
	}
}