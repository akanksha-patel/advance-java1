package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class DiceRollerServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
								throws IOException,ServletException{
		

		RequestDispatcher vw = request.getRequestDispatcher("rolldice.jsp");
		vw.forward(request, response);
	}
}