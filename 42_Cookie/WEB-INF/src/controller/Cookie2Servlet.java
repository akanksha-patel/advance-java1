package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Cookie2Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
							throws IOException,ServletException{
		
		request.getSession();

		response.setContentType("text/html");

		Cookie[] cks = request.getCookies();

		PrintWriter pw = response.getWriter();

		pw.write("Inside Page two <br /><br />");

		for(Cookie ck : cks){
			pw.write("Cookie Name: "+ck.getName()+" - "+" and value: "+ck.getValue()+"<br /><br />");			
		}
		

		pw.flush();
		pw.close();
	}
}