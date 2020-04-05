package com.JSP_Tutorial;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/StudentDisplayServlet")
public class StudentDisplayServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
		Student s =new Student(1,"maulik");
        request.setAttribute("student", s);
		RequestDispatcher rd = request.getRequestDispatcher("StudentDisplay.jsp");
		rd.forward(request, response);
	}
}
 