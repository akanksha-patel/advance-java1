package subfldr;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ParamServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
							throws IOException,ServletException{
		//Case 1:
		//String city = request.getParameter("city");
		
		//Case 2:
		String[] cities = request.getParameterValues("city");

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();		
		
		//Case 1:
		//pw.write("Ur City selection is: "+city+"<br />");
	
		//Case 2:
		
		for(int i=0;i<cities.length;i++)
			pw.write("Ur City selection no. "+(i+1)+" is: "+cities[i]+"<br />");
			

		pw.flush();
		pw.close();
	}
}