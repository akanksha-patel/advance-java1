package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import model.*;

public class StandardActionServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
							throws IOException, ServletException{
			
		
		Person p = new Employee(23423);
		p.setName("Rajiv");
		p.setAge(22);
		
		request.setAttribute("prsn",p);
		

		RequestDispatcher vw = request.getRequestDispatcher("nxpg.jsp");
		vw.forward(request,response);
	}
}