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
 <ab:form action="xmaptodb" commandName="xmapobj" method="post" >
<label>product</label>
<ab:select path="productid">
<s:forEach var="pord" items="${product}">

<option value="${pord.productid}">${pord.productname}</option>

</s:forEach>
</ab:select>

<label>supplier</label>
<ab:select path="supplierid">
<s:forEach var="por" items="${supplier}">

<option value="${por.supplierid}">${por.suppliername}</option>

</s:forEach>
</ab:select>

 price<ab:input path="productsupplierprice"/>
 stock<ab:input path="productsupplierstock"/>
 <label>true</label>
 <ab:radiobutton path="isproductavailable" value="true"></ab:radiobutton>
 <label>false</label>
 <ab:radiobutton path="isproductavailable" value="false"></ab:radiobutton>
 
<ab:button>add </ab:button>

</ab:form> 

</body>
</html>