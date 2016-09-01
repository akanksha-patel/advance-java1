package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class SessionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
						throws IOException, ServletException{
		
		HttpSession hs = request.getSession();
		
		System.out.println(hs.getId()+" from servlet 1");
		hs.setMaxInactiveInterval(30);
		System.out.println("Inactive Interval Period: "+hs.getMaxInactiveInterval()+" Inside Servlet-1");
		

		RequestDispatcher vw = request.getRequestDispatcher("nxt2.html");
		vw.forward(request,response);
	}
}