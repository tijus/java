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
	//String fname=request.getParameter("firstname");
	//String lname=request.getParameter("lastname");
	//String ages=request.getParameter("age");
	
%>

<jsp:useBean class="com.Employee" id="emp" scope="session"/>
<jsp:setProperty name="emp" property="*"/>
	

<p><a href="NextPage.jsp">Please click to continue</a></p>

</body>
</html>