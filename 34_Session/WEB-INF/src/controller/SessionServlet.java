package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SessionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
						throws IOException, ServletException{
		
		HttpSession hs = request.getSession();
		
		System.out.println(hs.getId()+" - "+hs.isNew());

		RequestDispatcher vw = request.getRequestDispatcher("nxt2.html");
		vw.forward(request,response);
	}
}