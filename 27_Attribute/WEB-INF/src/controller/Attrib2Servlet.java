package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Attrib2Servlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
							throws IOException,ServletException{
		
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		
		String val = request.getParameter("val");
		pw.write("The number you entered: "+val);
		
		boolean flag = (Boolean)request.getAttribute("isodd");
		//pw.write("<br />The number is odd: "+flag);
		pw.write("<br />The number is: "+(flag?"odd":"even"));
		
		pw.flush();
		pw.close();
	}
}