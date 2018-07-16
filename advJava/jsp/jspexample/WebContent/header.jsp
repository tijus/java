<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%!
 int pageCount = 0;
 int addCount(){
	 pageCount++;
	 return pageCount;
 }
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test | Page</title>
</head>
<body>
<center>
<h2>The include directive example</h2>
<p> This site has been visited <%= addCount() %> number of times</p>
</center>
</body>
</html>