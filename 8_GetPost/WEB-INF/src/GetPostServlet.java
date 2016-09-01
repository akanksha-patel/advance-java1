import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
import java.util.*;

public class GetPostServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
						throws IOException,ServletException{
		
		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request,HttpServletResponse response) 
						throws IOException,ServletException{

		response.setContentType("text/html");
	
		PrintWriter pw = response.getWriter();
		
		
		pw.write("<font color='red' size='32' face='verdana'>Hello World...</font>");

		pw.flush();
		pw.close();		
	}
}