package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class SessionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
						throws IOException, ServletException{
		
		HttpSession hs = request.getSession();
		
		System.out.println(hs.getId()+" - In servlet 1");
		
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>In Second Page</h1>");
		
		//Cas 1:
		//pw.write("<a href='act2.do'>To Third Page</a>");

		//Case 2:
		String encdURL = response.encodeURL("act2.do");
		pw.write("<a href='"+encdURL+"'>To Third Page</a>");

		pw.flush();

		pw.close();
		
	}
}