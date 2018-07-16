<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="com.Employee">
	<jsp:setProperty name="emp" property="firstname" value="Bill" />
	<jsp:setProperty name="emp" property="lastname" value="Gates"/>
	<jsp:setProperty name="emp" property="age" value="50"/>
</jsp:useBean>

<p>Employee first name:</p>
<jsp:getProperty name="emp" property="firstname"/><br>
<p>Employee last name:</p>
<jsp:getProperty name="emp" property="lastname"/><br>
<p>Employee age:</p>
<jsp:getProperty name="emp" property="age"/><br>
</body>
</html>