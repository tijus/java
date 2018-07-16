<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <title>JSTL Example</title>
  </head>

  <body>
   <h4> c:out  Tag -  It prints Literal Value</h4>
    <c:out value =  "Printing Value"/>
     
	<h4> c:out  Tag -  It prints parameter Value</h4>
    <c:out  value = "${param.uname}"/>
    
    <h4> c:out  Tag -  It prints parameter Value.  If not, prints default</h4>
    <c:out  value = "${param.uname}"   default = "Default Value"/>
    
    <br/><br/>
    
    <h4> The c:set tag is JSTL-friendly version of the setProperty action. </h4>    
    <h4>The tag is helpful because it evaluates an expression and uses the results to set a value of a JavaBeans or attribute </h4>
    
    <c:set var="x" value="10" scope="session"></c:set>
	<c:set var="y" value="20" scope="session"></c:set>
	<c:set var='z' value="50" scope="session"></c:set>
	<h4>Addition :<c:out value="${x+y+z}"></c:out></h4>
	<h4>subtraction  :<c:out value="${z-y-x}"></c:out></h4>
	<h4>multiplication  :<c:out value="${x*y*z}"></c:out></h4>   
     
	<br/><br/>
	
	 <h4> The c:remove tag is used to remove attributes from specified scope </h4>   
	 <c:set var="num1" value="100" scope="session"></c:set>
	 <c:set var="num2" value="200" scope="session"></c:set>
	 <h4>Product :<c:out value="${num1*num2}"></c:out></h4>
	 <c:remove var="num1"/>
	 <c:remove var="num2"/>
	 <h4>Product :<c:out value="${num1*num2}"></c:out></h4>	 
	 <br/><br/>
	 
	 <h4> The c:if tag </h4>   
	 <c:set var="age" value="20"></c:set>
	 <c:if test="${age ge 18}">
	 <h4><c:out value="You are adult"></c:out></h4>
	 </c:if>
	 <br/><br/>
	  
	<h4> The conditional tags  c:choose </h4>    
	<c:set var="age" scope="session" value="${5}"/>
	<p>Your age is : <c:out value="${age}"/></p>
	<c:choose>
    	<c:when test="${age <= 12}">
       		You are a child
   	 	</c:when>
    	<c:when test="${age > 12}">
        	You are teenager
    	</c:when>
    	<c:otherwise>
        	No comment sir...
    	</c:otherwise>
	</c:choose>		
	<br/><br/>
	
	<h4> The iteration tags c:for </h4>   
	<c:forEach var="i" begin="1" end="10" step="1">
      <c:out value="${i}" />
      <br />
    </c:forEach>
    <br/><br/>
	
  </body>
</html>