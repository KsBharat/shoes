<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ include file="links.jsp" %>
</head>
<body>
<%@include file="navbaradmin.jsp" %>

<ab:form action="editproductstodb" commandName="productObj" method="post" enctype="multipart/form-data">

<ab:hidden path="productid"/>
<label>product name</label>
<div>
<ab:input path= "productname"/>
</div>
<label>product description</label>
<div>
<ab:input path="productdesc"/></div>

<label>true:</label>
<ab:radiobutton path="isproductavailable" value="true"></ab:radiobutton>
<label>false:</label>
<ab:radiobutton path="isproductavailable" value="false"></ab:radiobutton>
 <label>select image</label>
<div>
<ab:input type="file" path="imagefile"/>
</div> 
<ab:button>Edit Product</ab:button>

</ab:form>


</body>
</html>