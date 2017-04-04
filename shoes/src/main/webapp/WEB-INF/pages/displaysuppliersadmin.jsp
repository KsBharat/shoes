<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="links.jsp" %>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="navbaradmin.jsp" %>
<table class="table table-bordered">
<tr>
<th>supplierid</th><th>suppliername</th><th>supplierdesc</th><th>issupplieravailable</th><th>image</th>
</tr>
<s:forEach var="s" items="${sup}">
<tr>
<td>${s.supplierid}</td><td>${s.suppliername}</td><td>${s.supplierdesc}</td><td>${s.issupplieravailable}</td><td><img src="resources//images//suppliers//${s.supplierid}.jpg" height="200" width="250"></td>
<td>
<a href="reqdeletesupplier?sid=${s.supplierid }"><span class="glyphicon glyphicon-trash"></span></a>
<a href="reqeditsupplier?sid=${s.supplierid }"><span class="glyphicon glyphicon-pencil"></span></a>
</td></tr>

</s:forEach>
</table>
</body>
</html>