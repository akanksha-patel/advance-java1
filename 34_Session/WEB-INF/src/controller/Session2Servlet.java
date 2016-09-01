package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Session2Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
						throws IOException, ServletException{
		
		HttpSession hs = request.getSession();
		
		System.out.println(hs.getId()+" - "+hs.isNew());

		RequestDispatcher vw = request.getRequestDispatcher("nxt3.html");
		vw.forward(request,response);
	}
}