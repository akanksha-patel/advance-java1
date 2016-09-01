package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ReqDispServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
							throws IOException,ServletException{
		
		
		System.out.println("Inside First Servlet");

		RequestDispatcher vw = request.getRequestDispatcher("act2.do");
		vw.forward(request,response);
	}
}