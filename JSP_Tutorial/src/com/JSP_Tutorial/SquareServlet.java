package com.JSP_Tutorial;

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


@WebServlet("/sq")
public class SquareServlet extends HttpServlet {
    
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
    
		int k=0;
		
		//Doing by cookies
		Cookie cookies[] = req.getCookies(); //getting cookies from a client
		for(Cookie c : cookies){
			if(c.getName().equals("k")){
				k = Integer.parseInt(c.getValue());
			}
		}
		
		
		//Doing calling by request dispatcher
		//int k = Integer.parseInt(req.getParameter("k"));
		
		//Doing by HttpSession 
		//HttpSession session = req.getSession();
		//int k = (int)session.getAttribute("k");
		//We can remove value from attribute by using session.remove("k")
		
		k = k*k;
		
       PrintWriter pw = res.getWriter();
        pw.println("Ressult is: "+k);
		
		//System.out.println("sq called!");  /debugging
    }
	
	
	
	}
