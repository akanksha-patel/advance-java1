package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import java.util.*;

public class JstlServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		HttpSession hs = request.getSession();
		
		/*
		String food = request.getParameter("food");
		if(food.equals("1")){
			request.setAttribute("food","Pizza");
		}else if(food.equals("2")){
			request.setAttribute("food","Burger");
		}else{
			request.setAttribute("food","Other");
		}*/

		RequestDispatcher view = request.getRequestDispatcher("nxtpg.jsp");
		view.forward(request,response);
	}
}