<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee  Form</title>
</head>
<body>
   <s:form action="empinfo" method="post">
      <s:textfield name="empno" label="Employee No." size="20" />
      <s:textfield name="name" label="Name" size="20" />
      <s:textfield name="age" label="Age" size="20" />
      <s:textfield name="email" label="Email " size="20" />    
      <s:textfield name="password" label="Password " size="20" />    
      <s:textfield name="rpassword" label="Re-enter Password " size="20" />   
      <s:submit name="submit" label="Submit" align="center" />
   </s:form>
</body>
</html>