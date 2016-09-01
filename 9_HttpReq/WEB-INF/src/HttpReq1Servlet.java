import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class HttpReq1Servlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
								throws IOException,ServletException{
	
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		//All Important ServletRequest Interface Methods:
		//++++++++++++++++++++++++++++++++++++

		pw.write("Character Encoding: "+request.getCharacterEncoding()+"<br />");

		pw.write("Content Length: "+request.getContentLength()+"<br />");

		pw.write("Content Type: "+request.getContentType()+"<br />");

		pw.write("Local Address: "+request.getLocalAddr()+"<br />");

		pw.write("Locale: "+request.getLocale()+"<br />");

		pw.write("Local Name: "+request.getLocalName() +"<br />");

		pw.write("Local Port: "+request.getLocalPort() +"<br />");

		pw.write("Protocol: "+request.getProtocol() +"<br />");

		pw.write("Remote Address: "+request.getRemoteAddr()  +"<br />");
		
		pw.write("Remote Host: "+request.getRemoteHost()  +"<br />");
		
		pw.write("Remote Port: "+request.getRemotePort() +"<br />");
	     
		pw.write("Scheme: "+request.getScheme() +"<br />");
		 
		pw.write("Server Name: "+request.getServerName() +"<br />");

		pw.write("Server Port: "+request.getServerPort() +"<br />");	
		
		pw.write("Is Secure: "+request.isSecure() +"<br />");	


		pw.flush();
		pw.close();
	}
}