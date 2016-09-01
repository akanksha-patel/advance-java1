package subfldr;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ParamServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
							throws IOException,ServletException{
	
		String[] fds = request.getParameterValues("fd");

		String travel = request.getParameter("trv");

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		
		if(fds!=null){
			for(String fd : fds){
				pw.print("Your food selection is: "+fd+" -<br />");	
			}
		}

		pw.write("Ur travel selection is: "+travel);

		pw.flush();
		pw.close();
	}
}