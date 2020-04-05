<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
  <%@ page import="java.sql.*"%>  <%--import database package --%>
  <%@ page import="java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <%
  try{
   String query ="select * from student where userid=4";
  
   Class.forName("com.mysql.jdbc.Driver");
   Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/aliens","root","3780");
   Statement st = con.createStatement();
   
   ResultSet rs = st.executeQuery(query);
   rs.next();
   
   int Rollno = rs.getInt(1);
   String Name = rs.getString(2); 
   
   out.println(Name +" "+Rollno);
  }
  catch(Exception e){System.out.println(e);}
   
  %>
  
  

</body>
</html>