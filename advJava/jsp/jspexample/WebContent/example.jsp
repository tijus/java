<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int count=0; %>
<% count++; %>
<%= "You are a visitor number" +count %>
<br>
<%! int count1=0; %>
<% count1++; %>
<%= "You are a visitor number" +count1 %>
<br>
<%    
		int num=2;
		for(int i=1; i<=10; i++)
		{
			int res;
			res=num*i;
		
		%>
		<table>
			<tr>
			<td>
			<%= i %>
			</td>
			<td>
			<%= res %>
			</td>
			</tr>
		</table>
		<%} %>	
		
	




</body>
</html>