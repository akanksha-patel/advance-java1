package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class JstlServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		HttpSession hs = request.getSession();
		
		request.setAttribute("pqr","Mohan");
		request.setAttribute("mno","Sohan");

		RequestDispatcher view = request.getRequestDispatcher("nxtpg.jsp");
		view.forward(request,response);
	}
}