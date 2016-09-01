package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CookieServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
							throws IOException,ServletException{
		
		request.getSession();

		response.setContentType("text/html");

		String nm = request.getParameter("nm");
		String pw = request.getParameter("pw");
		String em = request.getParameter("em");


		Cookie ck1 = new Cookie("unm",nm);
		Cookie ck2 = new Cookie("psw",pw);
		Cookie ck3 = new Cookie("eml",em);

		response.addCookie(ck1);
		response.addCookie(ck2);
		response.addCookie(ck3);

		PrintWriter pwr = response.getWriter();

		pwr.write("Inside Page one <br /><br />");
		pwr.write("<a href='act2.do'>To Next Page</a>");		

		pwr.flush();
		pwr.close();
	}
}