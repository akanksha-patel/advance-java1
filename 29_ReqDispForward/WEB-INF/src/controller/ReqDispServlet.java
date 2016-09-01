package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ReqDispServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
							throws IOException,ServletException{
		
		String thNm = Thread.currentThread().getName();
		
		System.out.println("Inside First Servlet - Before "+thNm);

		RequestDispatcher vw = request.getRequestDispatcher("act2.do");
		vw.forward(request,response);
	
		System.out.println("Inside First Servlet - After "+thNm);
	}
}