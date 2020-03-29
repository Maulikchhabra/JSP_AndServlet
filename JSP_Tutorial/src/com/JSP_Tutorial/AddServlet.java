package com.JSP_Tutorial;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

/*
 * Annotations do the same work as web.xml does but in a short way ,you just have to write 
 * 
 * @WebServlet("servlet url pattern")
 * 
 * and it will do the work*/


@WebServlet("/add")
public class AddServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		int i  = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2")); //taking the input which were named as num1 and num2 in index.html
		
		int k = i+j;
		
		//Doing by HttpSession
		//HttpSession session = req.getSession();
		//session.setAttribute("k", k);
		
		//Doing calling by sendRedirect theory
	    //res.sendRedirect("sq?k="+k); //using space after = will give error  (session management or URL writing used here.)
		
		//Doing by cookies
		//Cookie cookie = new Cookie("k", k + ""); //Cookie is a class , making its object require two arguments 1st being the cookie name and 2nd being value but in string type.
		//res.addCookie(cookie);
		
		//Doing calling by request dispatcher
		//req.setAttribute("k", k); //setting the data to request object to pass in another servlet squareservlet
		//Request dispatcher calls one servlet from other servlet.
		//RequestDispatcher rd = req.getRequestDispatcher("sq");
		//rd.forward(req, res);
		
		
		res.sendRedirect("sq");
		
		PrintWriter pw = res.getWriter(); //making object of PrintWriter to print output on webpage
		
		pw.println("<html><body bgcolor ='cyan'>");
		pw.println("result is : "+ k);
		pw.println("</body></html>");
	}
	
}
