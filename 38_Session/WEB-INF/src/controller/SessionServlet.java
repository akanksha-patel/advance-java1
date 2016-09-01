package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class SessionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
						throws IOException, ServletException{
		
		HttpSession session = request.getSession();
		
		String nm = request.getParameter("nm");
		String pw = request.getParameter("pass");

		if(nm.equals("mohan")&&pw.equals("1234")){
			session.setAttribute("user","mohan");
		}else if(nm.equals("dinesh")&&pw.equals("4567")){
			session.setAttribute("user","dinesh");
		}else{
			session.setAttribute("user","Anonymus");
		}
		
		session.setMaxInactiveInterval(30);

		RequestDispatcher vw = request.getRequestDispatcher("act2.do");
		vw.forward(request,response);
	}
}