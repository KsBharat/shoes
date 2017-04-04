<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> --%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="links.jsp" %>   
<head>
<meta name="viewport" content="width=device-width,initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>



<style>
 body{ 

background-size:contain;

background-repeat:no-repeat;

background-attachment:fixed;

background-size:100% 100%;
}
video#bgvid { 
    position: fixed;
    top: 50%;
    left: 50%;
    min-width: 100%;
    min-height: 100%;
    width: auto;
    height: auto;
    z-index: -100;
    -ms-transform: translateX(-50%) translateY(-50%);
    -moz-transform: translateX(-50%) translateY(-50%);
    -webkit-transform: translateX(-50%) translateY(-50%);
    transform: translateX(-50%) translateY(-50%);
    background:  no-repeat;
    background-size: cover; 
}







}
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 100%;
      height:100%;
      margin: auto;
  }
  </style>

</head>

<body background=resources/images/messi.jpg >


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
      <!-- <li><a href="reqsignuppage"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li> -->
      <li><a href="customersignupnew"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <!-- <li><a href="reqsignin"><span class="glyphicon glyphicon-log-in"></span> Login</a></li> -->
       <li><a href="reqspringloginpage"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
     </ul>
      <ul class="nav navbar-nav navbar-right">
     <!-- <!--  <li><a href="reqForSignupPage"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li> -->
      
        <!-- <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModalSignUp" style="color:yellow;background-color:transparent;border:0px;">
        <span class="glyphicon glyphicon-user"></span>   SignUp</button>
        
      <li><a href="reqForLoginPage"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModalLogin" style="color:yellow;background-color:transparent;border:0px;margin-right:10">
        <span class="glyphicon glyphicon-log-in"></span>   Login     </button>  -->
  </div> 
</nav>
<!-- <video autoplay loop muted poster="shoes.jpg" id="bgvid">
    <source src="resources/images/video/Shoes.mp4" type="video/mp4">
    </video>  --> 
  
<div class="container">
  <h3>shoes with best deals</h3>
  <p><b><center> some say laughter is the best medicine.but we say new shoes</center><b></p>
</div>

<!-- <body> -->
<!-- <div class="col-sm-4" align="right" contols muted> 
  <video controls autoplay width="500px" height="450px">
  <source src="resources/images/video/RONALDONEWSHOES.mp4"type="video/mp4">
  <source src="movie.ogg" type="video/ogg">
  Your browser does not support the video tag.
</video>
</div> -->

<div class="container-fluid" >
<div class="col-sm-4">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
      <li data-target="#myCarousel" data-slide-to="5"></li>
    
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="resources/images/adidassuperfont.jpg" alt="Chania" width="460" height="345">
      </div>
      

      <div class="item">
        <img src="resources/images/conversecanvasallstaroxshoespink.jpg" alt="Chania" width="460" height="345">
      </div>
    
      <div class="item">
        <img src="resources/images/grimentin.jpg" alt="chania" width="460" height="345">
      </div>

      <div class="item">
        <img src="resources/images/image1.jpg" alt="chania" width="460" height="345">
      </div> 
    
    <!-- <div class="item">
        <img src="resources/images/shoe4.jpg" alt="chania" width="460" height="345">
      </div> -->
  
    <!-- <div class="item">
        <img src="resources/images/studs4adidas.jpg" alt="chania" width="460" height="345">
      </div> -->
    </div>
</div>
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"style="opacity:0.4"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true" style="opacity:0.4"></span>
      <span class="sr-only">Next</span>
      
    </a>
  </div>


<!-- <div class="col-sm-4"> 
  <video controls autoplay muted width="400px" height="450px">
  <source src="resources/images/video/RONALDONEWSHOES.mp4"type="video/mp4">
  <source src="movie.ogg" type="video/ogg">
  Your browser does not support the video tag.
</video>
</div>

<div class="col-sm-4"> 
  <video controls autoplay muted width="400px" height="450px">
  <source src="resources/images/video/ibra.mp4"type="video/mp4">
  <source src="movie.ogg" type="video/ogg">
  Your browser does not support the video tag.
</video>
</div> -->

</div>

 <%-- <!-- Modal ends - Login -->
 
 
  <!-- Modal starts - SignUp -->
  <div class="modal fade" id="myModalSignUp" role="dialog" >
  <br><br><br>
    <div class="modal-dialog">
        
      <!-- Modal content-->
      <div class="modal-content" style="background:rgba(90,90,30,0.2)">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" style="color:yellow">&times;</button>
          <h4 class="modal-title" style="color:yellow">SignUp Form</h4>
        </div>
        <div class="modal-body" style="align:center;background:rgba(90,90,30,0.6)">  
        
        	<ab:form  class="form-horizontal" commandName="customerObject" method="POST" action="reqSendSignupDataToDB" encType="multipart/form-data">

			   <ab:hidden path="customerid"></ab:hidden>
			      <div class="col-sm-3" style="background-color:transparent;color:yellow; vertical-align:baseline">Customer Name </div>
			      <div class="col-sm-8" style="background-color:transparent">
				       <ab:input path="firstname" class="form-control" placeholder="Enter Customer Name" style="background-color:transparent;color:yellow"/>
				       <ab:input path="lastname" class="form-control" placeholder="Enter Customer Name" style="background-color:transparent;color:yellow"/>
				  </div>
			
			      <div class="col-sm-3" style="background-color:transparent;color:yellow">Email ID </div>
			      <div class="col-sm-8" style="background-color:transparent">
				       <ab:input path="emailid" class="form-control" placeholder="Enter Email ID" style="background-color:transparent;color:yellow"/>
				  </div>		
				
			      <div class="col-sm-3" style="background-color:transparent;color:yellow">Mobile No. </div>
			      <div class="col-sm-8" style="background-color:transparent">
				       <ab:input path="mobileno" class="form-control" placeholder="Enter Mobile No." style="background-color:transparent;color:yellow"/>
				  </div>		
				
			      			
					<br> Authentication details <br>
			      <div class="col-sm-3" style="background-color:transparent;color:yellow">Password</div>
			      <div class="col-sm-8" style="background-color:transparent">
				       <ab:password path="userDetails1.password" class="form-control" placeholder="Enter Password" style="background-color:transparent;color:yellow"/>
				  </div>	
				  	
				  	 <div class="col-sm-3" style="background-color:transparent;color:yellow">Image</div>
			      <div class="col-sm-8" style="background-color:transparent">
				      <ab:input type="file" path="userDetails1.userimagefile" class="form-control" style="background-color:transparent;color:yellow"/>
				  </div>		
				  			
				  			
				  			
						<br> Address <br>
			      <div class="col-sm-3" style="background-color:transparent;color:yellow">House No.</div>
			      <div class="col-sm-8" style="background-color:transparent">
				       <ab:input path="shippingAddress.houseno" class="form-control" placeholder="Enter House No." style="background-color:transparent;color:yellow"/>
				  </div>				
			
			  		 <div class="col-sm-3" style="background-color:transparent;color:yellow">Street</div>
			      <div class="col-sm-8" style="background-color:transparent">
				       <ab:input path="shippingAddress.street" class="form-control" placeholder="Enter Street" style="background-color:transparent;color:yellow"/>
				  </div>	
				  
			      <div class="col-sm-3" style="background-color:transparent;color:yellow">Area</div>
			      <div class="col-sm-8" style="background-color:transparent">
				       <ab:input path="shippingAddress.area" class="form-control" placeholder="Enter Area" style="background-color:transparent;color:yellow"/>
				  </div>				
		
		     	<div class="col-sm-3" style="background-color:transparent;color:yellow">City</div>
			      <div class="col-sm-8" style="background-color:transparent">
				       <ab:input path="shippingAddress.city" class="form-control" placeholder="Enter City" style="background-color:transparent;color:yellow"/>
				  </div>
				  
		     	<div class="col-sm-3" style="background-color:transparent;color:yellow">State</div>
			      <div class="col-sm-8" style="background-color:transparent">
				       <ab:input path="shippingAddress.state" class="form-control" placeholder="Enter State" style="background-color:transparent;color:yellow"/>
				  </div>
				  
	     		<div class="col-sm-3" style="background-color:transparent;color:yellow">Country</div>
			      <div class="col-sm-8" style="background-color:transparent">
				       <ab:input path="shippingAddress.country" class="form-control" placeholder="Enter Country" style="background-color:transparent;color:yellow"/>
				  </div>		
			
	     		<div class="col-sm-3" style="background-color:transparent;color:yellow">Pincode</div>
			      <div class="col-sm-8" style="background-color:transparent">
				       <ab:input path="shippingAddress.pincode" class="form-control" placeholder="Enter Pincode" style="background-color:transparent;color:yellow"/>
				  </div>
				  
		
				<br> 
				<ab:button class="btn btn-primary active">SignUp</ab:button>
	
			</ab:form>        
     
          </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal" style="color:blue">Close</button>
        </div>
      </div>
      
    </div>
  </div>
   
 <!-- Modal ends - SignUp -->
         
    <s:if test="${message==1}">
    <div class="container">
    <br><br>
    <div col-sm-3></div>
    <div col-sm-6>
     <div class="alert alert-danger alert-dismissable fade in">
    <a href="#" class="close" data-dismiss="alert" aria-label="close">×</a>
    ${message1}
    </div>
  </div>
  </div>
  </s:if>     
 
  
    <s:if test="${message==0}">
    <div class="container">
    <br><br>
    <div col-sm-3></div>
    <div col-sm-6>
     <div class="alert alert-danger alert-dismissable fade in">
    <a href="#" class="close" data-dismiss="alert" aria-label="close">×</a>
    <strong>Error!</strong>       Login failed...Try again..
    </div>
  </div>
  </div>
  </s:if> --%>





<!--  thumbnails  started -->
<div class="col-sm-12">
</div>
<div class="container-fluid">
<div class="row" >





	<div class="col-sm-3" style="background-color:white; border-style:none; left-padding:5px;">
		<div class="thumbnail" style="border:3px solid green; border-radius:8px; padding:5px; border-style: double;"> 
		 <img src="resources/images/thumbnails/2017-spring-summer-white-women-39-s-canvas.jpg" style="width:220px; height:200px;"/>
		 <br>
		 
		
		</div>
		</div>
	
	<div class="col-sm-3" style="background-color:white; border-style:none; left-padding:5px">
		<div class="thumbnail" style="border:3px solid green; border-radius:8px; padding:5px; border-style: double">
		 <img src="resources/images/thumbnails/shoe2.jpg" style="width:220px; height:200px;"/>
		 <br>
		 
		
		</div>
		</div>
	
	<div class="col-sm-3" style="background-color:white; border-style:none; left-padding:5px">
		<div class="thumbnail" style="border:3px solid green; border-radius:8px; padding:5px; border-style: double">
		 <img src="resources/images/thumbnails/snowy shoes.jpg" style="width:220px; height:200px;"/>
		
		</div>
		</div>
		
		
	<div class="col-sm-3" style="background-color:white; border-style:none; left-padding:5px">
		<div class="thumbnail" style="border:3px solid green; border-radius:8px; padding:5px; border-style: double">
		 <img src="resources/images/thumbnails/alplha coders casuals sneakers for women and men.jpg" style="width:220px; height:200px;"/>
		
		</div>
		</div>
		
	<!-- <div class="col-sm-2" style="background-color:white; border-style:none; left-padding:5px">
		<div class="thumbnail" style="border:3px solid green; border-radius:8px; padding:5px; border-style: double">
		 <img src="resources/images/products/thumbnail/PRD00005.jpg" style="width:220px; height:200px;"/>
		
		</div>
		</div>
		
		
	<div class="col-sm-2" style="background-color:white; border-style:none; left-padding:5px">
		<div class="thumbnail" style="border:3px solid green; border-radius:8px; padding:5px; border-style: double">
		 <img src="resources/images/shoe1.jpg" style="width:220px; height:200px;"/>
		</div>
		</div> -->
		
		</div>
		</div>
		
		<div class="container-fluid">
		<div class="row">
		
<s:forEach var="vie" items="${view}">
	
		<div class="col-sm-3 zoom-effect-container" style="background-color:transparent; border-style:none; left-padding:5px;">
		<div  class="thumbnail image-card" style="height: 370px;background-color:transparent;border:3px solid green; border-radius:8px; padding:5px; border-style: none; text-align:center; font-size:20px; font-style:bold"> 
		    <img id="boxshadow" src="resources/images/products/${vie.productid}.jpg" style="width:220px; height:200px;" class="img-rounded"/>
			<br>Name : ${vie.productname} 
		 	<br>Supplier : ${vie.suppliername}
		 	<br>Price : ${vie.productsupplierprice}
	</div>
	</div>
	</s:forEach>
</div>
</div>
		
WELCOME
<br>
<!--  <a href="reqsignin">signin</a>-->

<!--<a href="reqsignuppage">signup</a>-->

</body>
</html>