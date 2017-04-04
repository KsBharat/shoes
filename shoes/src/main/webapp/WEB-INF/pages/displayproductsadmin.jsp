<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@ include file="links.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="navbaradmin.jsp" %>
<%-- ${pord} --%>
<table class="table table-bordered">
<tr>
<th>productid</th><th>productname</th><th>productdesc</th><th>isproductavailable</th><th>image</th>
</tr>
<s:forEach var="prd" items="${pord}">
<tr>
<td>${prd.productid}</td><td>${prd.productname}</td><td>${prd.productdesc}</td><td>${prd.isproductavailable}</td><td><img src="resources/images/products/${prd.productid}.jpg" height="200" width="250"/></td>
<td>
<a href="reqdeleteproduct?pid=${prd.productid }"><span class="glyphicon glyphicon-trash"></span></a>
<a href="reqeditproductpage?pid=${prd.productid }"><span class="glyphicon glyphicon-pencil"></span></a>

</td>

</tr>
</s:forEach>




</table>

</body>
</html>