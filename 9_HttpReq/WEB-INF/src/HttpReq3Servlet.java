import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class HttpReq3Servlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
								throws IOException,ServletException{
	
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		//All Important HttpServletRequest Interface  -Header- Methods:
		//++++++++++++++++++++++++++++++++++++

		pw.write("Header Keep Alive: "+request.getHeader("keep-alive") +"<br />");
		pw.write("Header Content Length: "+request.getHeader("content-length") +"<br />");
		

		//Case 1:
		//pw.write(request.getHeader("keep-alive")+2);

		//Case 2:
		//int kpAlv = Integer.parseInt(request.getHeader("keep-alive"));
		//int cntLng = Integer.parseInt(request.getHeader("content-length"));
		//pw.write(cntLng+2);

		//Case 3:
		pw.write(request.getIntHeader("keep-alive")+2);
		

		pw.flush();
		pw.close();
	}
}