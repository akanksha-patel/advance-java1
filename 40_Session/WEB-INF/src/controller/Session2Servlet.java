package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Session2Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
						throws IOException, ServletException{
		
		HttpSession hs = request.getSession();
		
		System.out.println("Creation Time: "+new Date(hs.getCreationTime())+" Inside Servlet-2");	
		hs.invalidate();
		System.out.println("Last Accessed Time: "+new Date(hs.getLastAccessedTime())+" Inside Servlet-2");	
		//throws IllegalStateException

		RequestDispatcher vw = request.getRequestDispatcher("nxt3.html");
		vw.forward(request,response);
	}
}