package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class SessionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
						throws IOException, ServletException{
		
		HttpSession hs = request.getSession();
		
		System.out.println("Creation Time: "+new Date(hs.getCreationTime())+" Inside Servlet-1");	
		hs.setMaxInactiveInterval(300);
		System.out.println(hs.getMaxInactiveInterval()+" Inside Servlet-1");
		System.out.println("Last Accessed Time: "+new Date(hs.getLastAccessedTime())+" Inside Servlet-1");	

		RequestDispatcher vw = request.getRequestDispatcher("nxt2.html");
		vw.forward(request,response);
	}
}