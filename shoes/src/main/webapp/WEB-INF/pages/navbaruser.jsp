<html>
<body>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" class="active"href="logincheck">shoes</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="logincheck"><span class="glyphicon glyphicon-home"></span>Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><img src="resources/images/users/${loginid}.jpg" width="25px" height="25px" class="img-circle">welcome ${username}  <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">edit profile</a></li>
          <li><a href="#">change password</a></li>
         <!-- <li><a href="j_spring_security_logout">logout</a></li> -->
          <li><a href="reqLogout">logout</a></li>
          <!-- <li><a href="#">Page 1-3</a></li> -->
          </ul>
          </li>
          <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">view <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li class="active"><a href="view">view</a></li>
           <li><a href="#">display products</a></li> 
		<!--   <li><a href="modifyproducts">modify products</a></li>	     -->    
        </ul>
        </li>
        <li><a href="reqdisplaycartproducts"><span class="glyphicon glyphicon-shopping-cart"></a></span>
         <!--  <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">suppliers <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="addsuppliers">add suppliers</a></li> 
          <li><a href="displaysuppliers">display suppliers</a></li>
          <li><a href="modifysuppliers">modify suppliers</a></li>
        </ul>
      </li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">productsupplier <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li class="active"><a href="xmap">add productsupplier</a></li>
          <li><a href="displayxmap">display productsupplier</a></li>
		  <li><a href="modifyproducts">modify products</a></li>	        
        </ul>
        </li> -->
      <!-- <li class="active"><a href="#">about us</a></li>
      <li><a href="#">contact us</a></li> -->
    </ul>
    <ul class="nav navbar-nav navbar-right">
    <!-- <li><a href="xmap"><span class="glyphicon glyphicon-log-in"></span>xmap</a></li> -->
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> About us</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span>Contact us</a></li>
      
  </div>
</nav>


</body>
</html>