<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="links.jsp" %>
     
     <link href = "https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel = "stylesheet">
      <script src = "https://code.jquery.com/jquery-1.10.2.js"></script>
      <script src = "https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
    
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
$(function(){
$('input[name=dateofbirth]').datepicker({
	format:'YYYY-mm-dd'
});	
});
</script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" class="active"href="welcome">shoes</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="#"><span class="glyphicon glyphicon-home"></span>Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="reqsignin">siginpage</a></li>
          <li ><a href="reqsignuppage">signuppage</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
      <li><a href="#">about us</a></li>
      <li><a href="#">contact us</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li class="active"><a href="reqsignuppage"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="reqspringloginpage"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
  </div>
</nav>


<ab:form commandName="userdetails" action="adduserdatatodb" method="POST">
<%-- <br>User id : <ab:input path="userid"/> --%>
<br>First Name:<ab:input path="firstname" placeholder="first name" />
<ab:errors path="firstname"></ab:errors>
<br>Last  Name:<ab:input path="lastname" placeholder="last name" />
<ab:errors path="lastname"></ab:errors>
<br> email id :<ab:input path="emailid" placeholder="email id" />
<ab:errors path="emailid"></ab:errors>
<br>date of birth:<ab:input path="dateofbirth" placeholder="enterdob" required="required"/>
<br> password :<ab:password path="password" placeholder="password"/><ab:errors path="password"></ab:errors>
<br>mobile no:<ab:input path="mobileno" placeholder="enter mobile no" required="required"/>
<br>address:<ab:input path="address" placeholder="address" required="required"/>
<br>city:<ab:input path="city" placeholder="city" required="required"/>
<br>pincode:<ab:input path="pincode" placeholder="pincode"/>
<br>state:<ab:input path="state" placeholder="state"/>
<br>country:<ab:input path="country" splaceholder="enter counrty"/>

<ab:button>submit</ab:button>

</ab:form>



</body>
</html>