package com.JSP_Tutorial;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*ServletConfig and servletContext
 * 
 *  ServletConfig is specific to  the servlet in which it is used through web.xml like making a tag init-param into a servlet tag in web.xml would lead to making it available to that servlet (check commented code in web.xml)
 *  
 *  While ServletContext shares the parameter to all the servlets made in the project and can be accessed by every servlet
 * 
*/

public class MyServlet extends HttpServlet{
   
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
	  
		PrintWriter pw = res.getWriter();
		pw.print("Hi ");
		
		
		//ServletContext start
		ServletContext ctx = getServletContext(); //ServletContext object formation
		
		String name =ctx.getInitParameter("Name");  //putting values of Name and Phone in name and phone
		String phone =ctx.getInitParameter("Phone");
		pw.println(name + " uses "+phone);
		//ServletContext complete
		
		//ServletConfig start
		/*
		 *  ServletConfig cg = getServletCongif();  //object formation
		 *  
		 *  String str = cg.getInitParameter("Name"); //accessing the name parameter through init-param tag in servlet tag in web.xml 
		 *  pw.println(str)
		 *  
		 *  ServletConfig complete*/
	
	
	
	}
	
}
