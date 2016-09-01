package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Session2Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
						throws IOException, ServletException{
		
		HttpSession hs = request.getSession(false);
		
		System.out.println(hs.getId()+" from servlet 2");
		System.out.println("Inactive Interval Period: "+hs.getMaxInactiveInterval()+" Inside Servlet-2");

		RequestDispatcher vw = request.getRequestDispatcher("nxt3.html");
		vw.forward(request,response);
	}
}