<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="links.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" class="active" href="welcome">shoes</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span>Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="reqsignin">siginpage</a></li>
          <li><a href="reqsignuppage">signuppage</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
      <li><a href="#">about us</a></li>
      <li><a href="#">contact us</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="reqsignuppage"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <!-- <li><a href="reqsignin"><span class="glyphicon glyphicon-log-in"></span> Login</a></li> -->
     <li><a href="reqspringloginpage"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
     </ul> 
  </div>
</nav>


<form action="j_spring_security_check" method="POST">

<label><br> user id :</label>
<!-- div class ="col-sm-12"> -->
<div>
<input text="username" name="j_username"/>
</div>

<label><br> password :</label>
<!-- <div class="col-sm-12"> -->
<div >
<input type="password" name="j_password"/>


</div>
<input type="submit" value="login"/>

</form>

</body>
</html>