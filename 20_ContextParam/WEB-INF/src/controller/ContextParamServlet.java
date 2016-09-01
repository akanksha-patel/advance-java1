package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ContextParamServlet extends HttpServlet
{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
							throws IOException,ServletException{
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();

		ServletConfig conf = getServletConfig();

		ServletContext cont = conf.getServletContext();

		String eml = cont.getInitParameter("mngEml");

		pw.print("Form First Servlet - The Manager Email is: <h3>"+eml+"</h3>");

		pw.flush();
		pw.close();
	}
}