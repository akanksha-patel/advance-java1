package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class InitParamServlet extends HttpServlet
{
	String mnagerEmail = "mohan@gmail.com";

	public void doGet(HttpServletRequest request, HttpServletResponse response)
							throws IOException,ServletException{
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();

		pw.print("The Manager Email is: <h3>"+mnagerEmail+"</h3>");

		pw.flush();
		pw.close();
	}
}