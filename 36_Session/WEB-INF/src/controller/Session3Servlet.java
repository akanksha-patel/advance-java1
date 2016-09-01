package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Session3Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
						throws IOException, ServletException{
		

		HttpSession hs = request.getSession();
		
		System.out.println(hs.getId()+" from servlet 3");
		System.out.println("Inactive Interval Period: "+hs.getMaxInactiveInterval()+" Inside Servlet-3");
		
		RequestDispatcher vw = request.getRequestDispatcher("index.html");
		vw.forward(request,response);

		
	}
}