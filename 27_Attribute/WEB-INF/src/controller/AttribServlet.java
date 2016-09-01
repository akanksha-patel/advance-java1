package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AttribServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
							throws IOException,ServletException{
		
		String theVal = request.getParameter("val");
		int tmp = Integer.parseInt(theVal);
		
		boolean flag = false;
		if(tmp%2==1){
			flag = true;
		}

		request.setAttribute("isodd",flag);

		RequestDispatcher vw = request.getRequestDispatcher("act2.do");
		vw.forward(request,response);
	}
}