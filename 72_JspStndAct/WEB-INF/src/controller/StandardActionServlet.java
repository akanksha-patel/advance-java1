package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import model.Person;

public class StandardActionServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
							throws IOException, ServletException{
		

		
		Person p = new Person();
		p.setName("mohan");
		p.setAge(12);

		request.setAttribute("prsn",p);
		
		//Above code is intentionally commented... 
		


		RequestDispatcher vw = request.getRequestDispatcher("nxpg.jsp");
		vw.forward(request,response);
	}
}