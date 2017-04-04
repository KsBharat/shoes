<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="links.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
#boxshadow {
    position: relative;
    -moz-box-shadow: 1px 2px 4px rgba(0, 0, 0,0.5);
    -webkit-box-shadow: 1px 2px 4px rgba(0, 0, 0, .5);
    box-shadow: 10px 20px 10px rgba(0, 0, 0, .5);
    padding: 1px;
    /* background: white; */
}
#boxshadow img {
    width: 100%;
    border: 1px solid #8a4419;
    border-style: inset;
}


#boxshadow::after {
    content: '';
    position: absolute;
    z-index: -1; /* hide shadow behind image */
    -webkit-box-shadow: 0 15px 20px rgba(0, 0, 0, 0.3);
    -moz-box-shadow: 0 15px 20px rgba(0, 0, 0, 0.3);
    box-shadow: 0 15px 20px rgba(0, 0, 0, 0.3);                
    width: 70%; 
    left: 15%; /* one half of the remaining 30% */
    height: 100px;
    bottom: 0;
}
.zoom-effect-container {
   /*  float: left;
    position: relative; 
    width: 640px;
    height: 360px;
    mardgin: 0 auto;
    overflow: hidden; */
}

.image-card {
 
  top: 0;
  left: 0;
}

.image-card img {
  -webkit-transition: 0.8s ease;
  transition: 0.8s ease;
}

.zoom-effect-container:hover .image-card img {
  -webkit-transform: scale(1.1);
  transform: scale(1.1);
}
</style>
</head>
<body>
<%@include file="navbaruser.jsp" %>



<div class="container">
	<div class="row">
		<s:forEach var="vie" items="${view}">
	
		<div class="col-sm-3 zoom-effect-container" style="background-color:transparent; border-style:none; left-padding:5px;">
			
		 <div  class="thumbnail image-card" style="height: 370px;background-color:transparent;border:3px solid green; border-radius:8px; padding:5px; border-style: none; text-align:center; font-size:20px; font-style:bold"> 
		    <img id="boxshadow" src="resources/images/products/${vie.productid}.jpg" style="width:220px; height:200px;" class="img-rounded"/>
		 	<b><br>Name : ${vie.productname} 
		 	<br>Supplier : ${vie.suppliername}
		 	<br>Price : ${vie.productsupplierprice}
		 	<br>stock : ${vie.productsupplierstock}</b>
		 	<br>
		 	<s:url value="/reqAddItemToCart/${vie.psid}" var="var"></s:url>
		 	<form action="${var}">
		 	<select name="qty" id="qty">
		 	<option value="1">1</option>
		 	<option value="2">2</option>
		 	<option value="3">3</option>
		 	<option value="4">4</option>
		 	<option value="5">5</option>		 	
		 	
		 	</select>
		 	<button type="submit" class="btri btn-warning btn-large">
		 	<span class="glyphicon glyphicon-shopping-cart"></span>cart
		 	</button>
		 	</form>
		 	</div>
			
		</div>
	
		</s:forEach>
	</div>
</div>


















</body>
</html>











<%-- 
<table class="table table-bordered">

<tr>
<th>productid</th><th>productname</th><th>psid</th><th>supplierid</th><th>suppliername</th><th>productsupplierprice</th><th>productsupplierstock</th>
</tr>
<s:forEach var="vie" items="${view}">
<tr>
<td>${vie.productid}</td><td>${vie.productname}</td><td>${vie.psid}</td><td>${vie.supplierid}</td><td>${vie.suppliername}</td><td>${vie.productsupplierprice}</td><td>${vie.productsupplierstock}</td>
</s:forEach>
</table> --%>