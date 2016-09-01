package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CookieServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
							throws IOException,ServletException{
		
		request.getSession();

		response.setContentType("text/html");

		Cookie ck1 = new Cookie("abc1","123");
		Cookie ck2 = new Cookie("abc2","456");
		Cookie ck3 = new Cookie("abc3","789");

		response.addCookie(ck1);
		response.addCookie(ck2);
		response.addCookie(ck3);

		PrintWriter pw = response.getWriter();

		pw.write("Inside Page one <br /><br />");
		pw.write("<a href='act2.do'>To Next Page</a>");		

		pw.flush();
		pw.close();
	}
}