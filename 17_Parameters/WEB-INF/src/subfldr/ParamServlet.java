package subfldr;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ParamServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
							throws IOException,ServletException{
		
		String message = request.getParameter("msg");

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();		
		
		//Case 1:
		//pw.write("Ur Message is: <br />"+message);
		
		//Case 2:
		String[] parts = message.split("\n");
		
		for(String prt : parts){
			pw.write(prt+"<br />");	
		}
		
		
		pw.flush();
		pw.close();
	}
}