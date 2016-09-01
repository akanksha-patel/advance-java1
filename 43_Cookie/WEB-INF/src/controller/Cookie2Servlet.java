package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Cookie2Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
							throws IOException,ServletException{
		
		request.getSession();

		response.setContentType("text/html");

		Cookie[] cks = request.getCookies();

		PrintWriter pw = response.getWriter();

		pw.write("Inside Page two <br /><br />");

		String em_=null,pw_=null;
		if(cks!=null){
			for(Cookie ck : cks){
				if(ck.getName().equals("eml")){
					em_ = ck.getValue();
				}else if(ck.getName().equals("psw")){
					pw_ = ck.getValue();
				}
			}
		}

		pw.write("<form action='#'>");
		pw.write("Email: <input type='text' name='em' value='"+(em_!=null?em_:"")+"' /><br /><br />");
		pw.write("Password: <input type='password' name='pw' value='"+(pw_!=null?pw_:"")+"' /><br /><br />");
		pw.write("<input type='submit' value='Login' />");
		pw.write("</form>");
		
		pw.flush();
		pw.close();
	}
}