package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import model.*;

public class JstlServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		HttpSession hs = request.getSession();
		
		Person emp = new Employee("mohan",23,45000);
		request.setAttribute("e",emp);

		Cookie ck = new Cookie("abc","345");
		response.addCookie(ck);

		RequestDispatcher view = request.getRequestDispatcher("nxtpg.jsp");
		view.forward(request,response);
	}
}