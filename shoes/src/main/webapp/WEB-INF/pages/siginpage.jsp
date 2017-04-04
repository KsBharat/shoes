<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="links.jsp" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body background="resources/images/shoe2.jpg">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" class="active"href="welcome">shoes</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="#"><span class="glyphicon glyphicon-home"></span>Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li ><a href="reqsignin">siginpage</a></li>
          <li><a href="reqsignuppage">signuppage</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
      <li><a href="#">about us</a></li>
      <li><a href="#">contact us</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="reqsignuppage"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li class="active"><a href="reqsignin"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
  </div>
</nav>

<h1>login</h1>
${message}
<ab:form commandName="userdetails" action="logincheck" method="POST">

<label><br> user id :</label>
<!-- div class ="col-sm-12"> -->
<div>
<ab:input path="userid"/>
</div>

<label><br> password :</label>
<!-- <div class="col-sm-12"> -->
<div >
<ab:password path="password"/>


</div>
<ab:button>login</ab:button>

</ab:form>





</body>
</html> --%>