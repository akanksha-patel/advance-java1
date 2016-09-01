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
		
		//Before:		
		//ServletConfig conf = getServletConfig();
		//String eml = conf.getInitParameter("mngEml");
		//After:
		String eml = getServletConfig().getInitParameter("mngEml");
		pw.print("@Init Parameter- The Manager Email is: <h3>"+eml+"</h3>");
		
		//Before:		
		//ServletConfig conf2 = getServletConfig();
		//ServletContext cont = conf2.getServletContext();
		//String eml2 = cont.getInitParameter("mngEml");
		//After:
		String eml2 = getServletConfig().getServletContext().getInitParameter("mngEml");
		pw.print("#Context Parameter- The Manager Email is: <h3>"+eml2+"</h3>");

		pw.flush();
		pw.close();
	}
}