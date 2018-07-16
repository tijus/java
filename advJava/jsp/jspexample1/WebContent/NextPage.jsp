<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean class="com.Employee" id="emp" scope="session"/>
<p>Employee first name</p>
	<jsp:getProperty name="emp" property="firstname" /><br>
<p>Employee last name</p>
	<jsp:getProperty name="emp" property="lastname" /><br>



</body>
</html>