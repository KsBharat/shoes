<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="links.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="navbaruser.jsp"%>
<br><br><br><br>

<div class="container">
<div class="row">

<div class="col-md-2" style=" background-color:transparent; border:none">
<s:url value="/reqClearCart/${customerid}" var="url"></s:url>
<a href="${url}" style="color:yellow;" class="btn btn-warning btn-large">Clear Cart</a>
</div>
<div class="col-md-6" style=" background-color:transparent; border:none"></div>

 <div class="col-md-4" align="right" style=" background-color:transparent; border:none"> 
 <b>Order Total : ${grandtotal}</b>
 <s:url value="/checkout?cartId=${customerid}" var="url"></s:url>
 <a href="${url}" style="color:yellow" class="btn btn-warning btn-large">Check Out</a>
 </div>
 </div>
 
 
 
 

 
 </div>
 
 <div class ="container">
 
 	<table border ="0" class="table table-stripped fixed_headers" style="font-weight:bold"  >
<thead>
<tr style="background:rgba(60,60,90,1);color:yellow;table-layout: fixed;">
<th style="text-align:center">Product</th>
<th style="text-align:center">Supplier</th>
<th style="text-align:center">Quantity</th>
<th style="text-align:center">Price</th>
<th style="text-align:center">Item wise Total</th>
<th style="text-align:center">Option</th>
</tr>
</thead>

<tbody>
<s:forEach var="cartitem" items="${cartitems}">
<tr style="text-align:center;background:rgba(90,90,30,0.7)">

<td style="vertical-align: middle;font-weight:bold;color:yellow">
<img style="border-radius:15px" src="resources/images/products/${cartitem.xmap_product_supplier.productid}.jpg" height="120" width="150" /></td>

<td style="vertical-align: middle;font-weight:bold;color:yellow">
<img style="border-radius:15px" src="resources/images/suppliers/${cartitem.xmap_product_supplier.supplierid}.jpg" height="120" width="150" /></td>

<td style="vertical-align: middle;font-weight:bold;color:yellow">${cartitem.quantity}</td>
<td style="vertical-align: middle;font-weight:bold;color:yellow">${cartitem.xmap_product_supplier.productsupplierprice}</td>
<td style="vertical-align: middle;font-weight:bold;color:yellow">${cartitem.itemwisetotal}</td>
<td style="vertical-align: middle;"> 
 <s:url value="/reqDeleteCartItem/${cartitem.cartitemid}" var="url"></s:url>
<a href="${url}" style="color:yellow;font-weight:bold" class="btn btn-warning btn-large">Delete</a>

</td>

</tr>
</s:forEach>
</tbody>


</table>
 
 
 
 </div>

<br><br>

</body>
</html>