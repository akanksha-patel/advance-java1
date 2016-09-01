package subfldr;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import java.util.*;

public class ParamServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
							throws IOException,ServletException{
		
		Enumeration en = request.getParameterNames();

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();		
		
		//Case 1:
		/*
		while(en.hasMoreElements()){
			pw.println(en.nextElement()+"<br />");
		}*/
		

		//Case 2:
		/*
		while(en.hasMoreElements()){
			String fldNm = (String)en.nextElement();			
			pw.println(fldNm+" = "+request.getParameter(fldNm)+"<br />");
		}*/

		//Case 3:
		/*
		while(en.hasMoreElements()){
			String fldNm = (String)en.nextElement();
			if(fldNm.equals("fd")){
				String[] fds = request.getParameterValues(fldNm);
				for(String s : fds){
					pw.println(fldNm+" = "+s+"<br />");
				}
			}else if(fldNm.equals("city")){
				String[] cts = request.getParameterValues(fldNm);
				for(String ct : cts){
					pw.println(fldNm+" = "+ct+"<br />");
				}
			}else{
				pw.println(fldNm+" = "+request.getParameter(fldNm)+"<br />");
			}			
		}*/
		
		//Case 4:
		
		while(en.hasMoreElements()){
			String fldNm = (String)en.nextElement();
			if(fldNm.equals("fd")){
				processResponse(request,pw,fldNm);	
			}else if(fldNm.equals("city")){
				processResponse(request,pw,fldNm);
			}else if(!fldNm.equals("pw")){
				pw.println(fldNm+" = "+request.getParameter(fldNm)+"<br />");
			}			
		}
		
		pw.flush();
		pw.close();
	}
	
	//Case 4:
	
	void processResponse(HttpServletRequest request,PrintWriter pw,String fldNm){
		String[] x = request.getParameterValues(fldNm);
		for(String tmp : x){
			pw.println(fldNm+" = "+tmp+"#<br />");
		}
	}


}