package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class PageContServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
							throws IOException,ServletException{

		HttpSession hs = request.getSession();
		ServletContext cnt = getServletContext();

		hs.setAttribute("abc", "session-scope");
		request.setAttribute("abc", "request-scope");		
		cnt.setAttribute("abc", "app-scope");

		RequestDispatcher vw = request.getRequestDispatcher("nxpg.jsp");
		vw.forward(request,response);
	}
}