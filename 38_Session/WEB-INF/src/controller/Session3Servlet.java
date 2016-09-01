package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Session3Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
						throws IOException, ServletException{
		
		HttpSession hs = request.getSession();
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		String nm = (String)hs.getAttribute("user");
		pw.write("Welcome "+nm+" You are visiting a safe area");
		pw.write("<a href='act4.do'>The Link To Another 2 resource</a>");

		pw.flush();
		pw.close();
	}
}