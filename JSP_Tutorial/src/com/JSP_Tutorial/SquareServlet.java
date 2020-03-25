package com.JSP_Tutorial;

import javax.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;


public class SquareServlet extends HttpServlet {
    
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
    
		int k = (int)req.getAttribute("k");
		
		k = k*k;
		
        PrintWriter pw = res.getWriter();
        pw.println("Ressult is: "+k);
    }
	
	
	
	}
