<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="links.jsp"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@include file="navbaradmin.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:foreach var="usr" items="${usrdata}">
<tr>
<td>
<s:if test="${usr.enabled==true}">
</s:if>
<s:if test="${usr.enabled==false}">
</s:if>
</td>
<td>
<s:if test="${usr.enabled==true}">
	<a href="reqdisableuser?uid=${usr.userid}"></td>disable</a>
</s:if>
<td>
<s:if test="${usr.enabled==false}">
	<a href="reqenableuser?uid=${usr.userid}"></td>enable</a>
	</s:if>
	
	</tr>
	</s:foreach>
	
	
</body>
</html>