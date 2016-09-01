package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class InitDestroyServlet extends HttpServlet{

	public void init() throws ServletException{
		ServletConfig conf = getServletConfig();
		ServletContext cont = getServletContext();

		String str1 = conf.getInitParameter("abc");
		String str2 = cont.getInitParameter("abc");

		System.out.println(str1+" - "+str2);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
							throws IOException, ServletException{
		
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>In Another Page</h1>");

		pw.flush();
		pw.close();
	}


	public void destroy(){
		System.out.println("#########The InitDestroyServlet example 45_ is deleted###############");
	}
}