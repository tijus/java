<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Action As Data Carrier</title>
</head>
<body>
		<table>
			<tr><td> <center><font color='red'><h2><s:text name="app.title"/></font></center></td></tr>
			<tr><td> <s:actionerror/></td></tr>
		</table>
		<table>
			<s:form name="myFrm" action="login" method="post">
				<s:textfield name="username" label="Enter User Name"/>
				<s:password name="password" label="Enter Password"/>
				<s:submit value="Click_Me"/>
			</s:form>
		</table>
		
			
		
</body>
</html>