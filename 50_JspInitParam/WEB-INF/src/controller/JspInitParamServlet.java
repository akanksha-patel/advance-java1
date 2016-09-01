package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class JspInitParamServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
							throws IOException, ServletException{
		
		HttpSession hs = request.getSession();

		System.out.println(hs.isNew());	
		System.out.println("Servlet Specific InitParameter: "+getServletConfig().getInitParameter("xyz"));

		System.out.println("Application Specific InitParameter: "+getServletContext().getInitParameter("xyz"));

		
		
		RequestDispatcher vw = request.getRequestDispatcher("nextpg.jsp");
		vw.forward(request,response);
	}
}