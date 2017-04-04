<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- <%@include file="links.jsp" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="links.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="navbaradmin.jsp" %>
<ab:form action="addsupplierstodb" commandName="suppliersobj" method="post" enctype="multipart/form-data">
<label>supplier name</label>
<div>
<ab:input path="suppliername"/>
</div>
<label>supplier desc</label>
<div>
<ab:input path="supplierdesc"/>
</div>
<label>True:</label>
<ab:radiobutton path="issupplieravailable" value="true"></ab:radiobutton>
<label>False:</label>
<ab:radiobutton path="issupplieravailable" value="false"></ab:radiobutton>
<label>image file</label>
<div>
<ab:input  type="file" path="imagesupplier"></ab:input>
</div>
<ab:button>submit</ab:button>



</ab:form>
</body>
</html>