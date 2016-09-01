package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ImplicitObjServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
							throws IOException, ServletException{
		HttpSession hs = request.getSession();

		System.out.println(hs.isNew());

		hs.setAttribute("abc","mno");
		
		RequestDispatcher vw = request.getRequestDispatcher("nextpg.jsp");
		vw.forward(request,response);
	}
}