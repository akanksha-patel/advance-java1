import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
import java.util.*;

public class GetDateTimeServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
						throws IOException,ServletException{

		response.setContentType("text/html");
	
		PrintWriter pw = response.getWriter();
		
		Date dt = new Date();
		pw.write("<h1>"+dt+"</h1>");

		pw.flush();
		pw.close();		
	}
}