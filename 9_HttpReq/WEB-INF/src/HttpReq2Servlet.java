import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class HttpReq2Servlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
								throws IOException,ServletException{
	
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		//All Important HttpServletRequest Interface Methods:
		//++++++++++++++++++++++++++++++++++++

		pw.write("Context Path: "+request.getContextPath() +"<br />");

		pw.write("Header - Accept-Encoding: "+request.getHeader("Accept-Encoding") +"<br />");

		pw.write("Method: "+request.getMethod()+"<br />");

		pw.write("Path Info: "+request.getPathInfo()+"<br />");

		pw.write("Query: "+request.getQueryString() +"<br />");

		pw.write("Request URI: "+request.getRequestURI()  +"<br />");

		pw.write("Request URL: "+request.getRequestURL() +"<br />");

		pw.write("Servlet Path: "+request.getServletPath() +"<br />");

		pw.flush();
		pw.close();
	}
}