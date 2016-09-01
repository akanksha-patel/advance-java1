package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SendRedirect2Servlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
							throws IOException,ServletException{
		
		System.out.println("I am in Servlet 2");

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("+++++++");

		pw.flush();
		pw.close();
	
	}
}