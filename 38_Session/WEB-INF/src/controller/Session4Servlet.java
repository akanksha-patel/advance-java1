package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Session4Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
						throws IOException, ServletException{
		
		HttpSession hs = request.getSession(false);
		
		if(hs!=null){
			response.setContentType("text/html");
		
			PrintWriter pw = response.getWriter();
			
			String nm = (String)hs.getAttribute("user");
			pw.write("Welcome "+nm+" You are visiting a aother safe area");

			pw.flush();
			pw.close();
		}else{
			RequestDispatcher vw = request.getRequestDispatcher("index.html");
			vw.forward(request,response);
		}
		
	}
}