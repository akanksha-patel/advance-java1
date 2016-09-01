package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Session3Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
						throws IOException, ServletException{
		

		HttpSession hs = request.getSession();

		System.out.println(hs.getId()+" - In servlet 3");
		
		
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>In Fourth Page</h1>");

		//Cas 1:
		//pw.write("<a href='index.html'>To Third Page</a>");
		
		//Case 2:
		String encdURL = response.encodeURL("index.html");
		pw.write("<a href='"+encdURL+"'>To index Page</a>");

		pw.flush();

		pw.close();
		
	}
}