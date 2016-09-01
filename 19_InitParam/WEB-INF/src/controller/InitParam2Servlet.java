package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class InitParam2Servlet extends HttpServlet
{
	//String mnagerEmail = "kartik@gmail.com";

	public void doGet(HttpServletRequest request, HttpServletResponse response)
							throws IOException,ServletException{
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		//-----------------New Changes
		ServletConfig cnf = getServletConfig();
		String eml = cnf.getInitParameter("mngEml");
		//------------------

		//pw.print("The Manager Email is: <h3>"+mnagerEmail+"</h3>");
		pw.print("The Manager Email is: <h3>"+eml+"</h3>");

		pw.flush();
		pw.close();
	}
}