<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="add.jsp" %> <%--including a jsp file in other --%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      
      <%!
          //declaration tag
          
          int val = 10;
      %>
      
      <%@page import="java.util.Scanner"%> <!-- Directive tag -->
      
      <%
        //scriptlet tag
        int m=9;
        out.println(7+5);
      %>
  
     Value of val number is : <%= val %> <!--Expression tag  -->
  
</body>
</html>