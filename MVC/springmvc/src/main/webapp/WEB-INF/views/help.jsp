<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1>HI THERE !! THIS IS HELP JSP</H1>

	<%
	
		String name = (String)request.getAttribute("name") ;
		Integer rollnumber = (Integer) request.getAttribute("rollnumber") ;
		String[] friends = (String[])request.getAttribute("friends") ;
	%>
	<h1>
	
	Hello !! <%=name %> <br>
	Your Roll Number Is : <%=rollnumber %>
	<br>
	friends[0] <br> friends[1] <br>
	
	</h1>


</body>
</html>