<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="Register"     method="post" >
	 
        <s:textfield name="userName" label="User Name" />
	    <s:password name="password" label="Password" />	
	    <s:radio name="gender" label="Gender" list="{'Male','Female'}" />
	    <s:textarea name="about" label="About You" />	    
	    
		<s:submit value = "Click Me"></s:submit>		 
		
		</s:form>		 

</body>
</html>