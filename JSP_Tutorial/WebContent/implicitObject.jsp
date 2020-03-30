<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
      <%
      /*
       Implicit Objects are :
    	    
    	   request (HTTpServletRequest)
    	   response (HttpServletResponse)
    	   pageContext (PageContext)
    	   out (JspWriter = PrintWriter Object)
    	   session (HttpSession)
    	   application (ServletContext)
    	   config (ServletConfig)
      */
      
      
        pageContext.setAttribute("Name", "maulik", PageContext.SESSION_SCOPE); //pageContext implicit object
        
        //config.getInitParameter(arg0);
      %>
    
    
</body>
</html>