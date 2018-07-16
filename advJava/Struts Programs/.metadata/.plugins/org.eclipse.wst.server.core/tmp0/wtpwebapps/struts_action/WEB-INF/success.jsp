<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
				<tr><td> <center><font color='red'><s:text name="app.title"/></font></center></td></tr>
			</table>
			<table>
				<tr><td>UserName := <s:property value="username"/></td></tr>
				<tr><td>Password := <s:property value="password"/></td></tr>
			</table>

</body>
</html>