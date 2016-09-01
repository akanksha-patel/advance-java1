package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ReqDisp2Servlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
							throws IOException,ServletException{
		
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		
		System.out.println("Inside Second Servlet");		
		pw.write("<font color='green' size='32'>From Second Servlet</font>");
				
		pw.flush();
		pw.close();
	}
}