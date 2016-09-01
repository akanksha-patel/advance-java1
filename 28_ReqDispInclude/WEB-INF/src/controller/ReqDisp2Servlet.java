package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ReqDisp2Servlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
							throws IOException,ServletException{
		
		PrintWriter pw = response.getWriter();
		pw.write("<font color='red' size='24'>Inside Another Servlet</font><br />");
	}
}