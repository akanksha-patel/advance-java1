package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Session2Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
						throws IOException, ServletException{
		
		HttpSession session = request.getSession();
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		String nm = (String)session.getAttribute("user");
		pw.write("Welcome "+nm);
		pw.write("<a href='act3.do'>The Link To Another resource</a>");

		pw.flush();
		pw.close();
	}
}