<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
This is the included html file using directive: <%@ include file="header1.html" %><br><br>
This is the included jsp file using directive: <%@ include file="header1.jsp" %><br><br>
This is the included html file using action: <jsp:include page="header1.html"/><br><br>
This is the included jsp file using action<jsp:include page="header1.jsp"/><br><br>

</body>
</html>