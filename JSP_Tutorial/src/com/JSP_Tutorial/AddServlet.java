package com.JSP_Tutorial;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		int i  = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2")); //taking the input which were named as num1 and num2 in index.html
		
		int k = i+j;
		
		
		
		req.setAttribute("k", k);
		
		
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		
		
		//PrintWriter pw = res.getWriter(); //making object of PrintWriter to print output on webpage
		
		//pw.println("result is : "+ k);
	}
	
}
