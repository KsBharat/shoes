<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="links.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%-- <%@include file="links.jsp"%> --%>
<title>Insert title here</title>



<style>

.s1{
color:black;
}

 
 body { 
    background-size: contain;
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-position: center;
    background-size: 100% 100%;  
    background-opacity:0.4;
    color:black;
   
} 
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
/* .zoom-effect-container {
    float: left;
    position: relative; 
    width: 300px;
    height: 300px;
    margin: 0 auto;
    overflow: hidden; 
}
 */
.image-card {
 
  top: 0;
  left: 0;
}

.image-card img {
  -webkit-transition: 0.3s ease;
  transition: 0.8s ease;
}

.zoom-effect-container:hover .image-card img {
  -webkit-transform: scale(1.1);
  transform: scale(1.1);
}




form {
    border: 3px transparent; /* solid #f1f1f1 */;
    height:600px;
    color:black;
}

input[type=text], input[type=password] {
    width: 50%;
    color:black;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color:black;
    padding: 12px 18px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 30%;
}


  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width:100%;
      height:600px;
      margin:;
  }
  .carousel-control.left, .carousel-control.right {
  background-image: none; opacity:0.6;
}
.carousel{
	margin-top:0;
}
.navbar {
    margin-bottom: 0;
    
}

.cancelbtn {
    width:auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align:left;
    margin: ;
}

img.avatar {
    width: 20%;
    border-radius: 15%;
}

.container {
    padding: 5px;
}

span.psw {
    float: right;
    padding-top: 10px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 80%;
    }

</style>

<!-- <style>

body{
background-size: contain;
background-repeat:no-repeat;
background-attachment:fixed;
background-position:center;
background-size:100% 100%;
background-opacity:0.4;
color:black;
}

input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 0px;
    /* #f2f2f2 */
}
</style> -->


</head>
<body background=resources/images/messi.jpg>



<!-- <body> -->










<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" class="active"href="welcome">shoes</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="welcome"><span class="glyphicon glyphicon-home"></span>Home</a></li>
      <!-- <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">offers <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="reqsignin">request product</a></li>
          <li ><a href="reqsignuppage">offers zone</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li> -->
      <li><a href="#">about us</a></li>
      <li><a href="#">contact us</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li class="active"><a href="customersignupnew"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="reqspringloginpage"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
  </ul>
  </div>
</nav>

	





<ab:form commandName="customerdetails" Action="addcustomertodb" enctype="multipart/form-data">
<ab:hidden path="customerid"/>
First Name<div><ab:input path="firstname" placeholder="enter your first name"/></div>
Last Name<div><ab:input path="lastname" placeholder="enter your last name"/></div>
Mobile no<div><ab:input path="mobileno" placeholder="enter mobile no"/></div>
Email id<div><ab:input path="emailid" placeholder="enter email id"/></div>


password<div><ab:input path="userDetails1.password" type="password" placeholder="password"/></div>

<%-- dateofbirth<div><ab:input path="userDetails1.dateofbirth" placeholder="dateofbirth"/></div> --%>

houseno<div><ab:input path="shippingAddress.houseno" placeholder="houseno"/></div>
street<div><ab:input path="shippingAddress.street" placeholder="street"/></div>
area<div><ab:input path="shippingAddress.area" placeholder="area"/></div>
city<div><ab:input path="shippingAddress.city" placeholder="city"/></div>
country<div><ab:input path="shippingAddress.country" placeholder="country"/></div>


state<div><ab:input path="shippingAddress.state" placeholder="state"/></div>
image<div><ab:input path="userDetails1.userimagefile" type="file"/></div>
<div><ab:button>signup</ab:button></div>


</ab:form>




</body>
</html>