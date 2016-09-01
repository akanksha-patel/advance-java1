package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SendRedirectServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
							throws IOException,ServletException{
		
		System.out.println("I am in Servlet 1");

		//Case 1:
		//RequestDispatcher vw = request.getRequestDispatcher("act2.do");
		//vw.forward(request,response);
		
		//Case 2:
		response.sendRedirect("act2.do");
	
	}
}