package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ReqDisp3Servlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
							throws IOException,ServletException{
		
		
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<font color='green' size='22'>Inside the third servlet- Before</font><br />");

		RequestDispatcher vw = request.getRequestDispatcher("act2.do");
		vw.include(request,response);

		pw.write("<font color='green' size='22'>Inside the third servlet- After</font><br />");

		pw.flush();
		pw.close();
	}
}