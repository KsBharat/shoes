<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
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

<%-- ${ps} --%>
<table class="table table-bordered">
<tr style="background:rgba(100,10,10,1);color:yellow;table-layout:fixed;">
<th>productid</th><th>supplierid</th><th>psid</th><th>productsupplierprice</th><th>productsupplierstock</th><th>isproductavailable</th>
</tr>
<s:forEach var="psid" items="${ps}">
<tr>
<td><img src="resources/images/products/${psid.productid}.jpg" height="30px"/>${psid.productid}</td><td><img src="resources/images/suppliers/${psid.supplierid}.jpg">${psid.supplierid}</td><td>${psid.psid}</td><td>${psid.productsupplierprice}</td><td>${psid.productsupplierstock}</td><td>${psid.isproductavailable}</td>
<td><a href="reqdeleteproductsupplier?psid=${psid.psid }"><span class="glyphicon glyphicon-trash"></span></a></td>
</tr>

</s:forEach>
</table>


</body>
</html>