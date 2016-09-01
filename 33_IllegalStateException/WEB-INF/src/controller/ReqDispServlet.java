package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ReqDispServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
							throws IOException,ServletException{
				
		System.out.println("Inside First Servlet - Before ");

		RequestDispatcher vw = request.getRequestDispatcher("act2.do");
		vw.forward(request,response);
		
		
		//Case 2:
		try{
			response.sendError(HttpServletResponse.SC_NOT_FOUND);
		}catch(IllegalStateException e){
			System.out.println("+++++++++++++++++++++++");
			e.printStackTrace();
			System.out.println("+++++++++++++++++++++++");
		}
		
		
		//Case 1 & 2:
		System.out.println("Inside First Servlet - After ");
	}
}