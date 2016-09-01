package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class InitParamServlet extends HttpServlet
{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
							throws IOException,ServletException{
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		
		String eml = getInitParameter("mngEml");
		pw.print("Init Parameter 1- The Manager Email is: <h3>"+eml+"</h3>");

		String eml2 = getInitParameter("mngEml2");
		pw.print("Init Parameter 2- The Manager Email is: <h3>"+eml2+"</h3>");
		
		
		ServletContext cont = getServletContext();
		String eml3 = cont.getInitParameter("admEml");
		pw.print("Context Parameter 1- The Manager Email is: <h3>"+eml3+"</h3>");

		String eml4 = cont.getInitParameter("admEml2");
		pw.print("Context Parameter 2- The Manager Email is: <h3>"+eml4+"</h3>");

		pw.flush();
		pw.close();
	}
}