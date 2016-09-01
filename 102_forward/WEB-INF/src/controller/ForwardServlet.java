package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import java.util.ArrayList;

public class ForwardServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		HttpSession hs = request.getSession();
		
		
		request.setAttribute("abc","mohan");

		RequestDispatcher view = request.getRequestDispatcher("nxtpg.jsp");
		view.forward(request,response);
	}
}