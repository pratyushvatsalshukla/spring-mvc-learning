<html>
<body>
<h2>Hello World!</h2>
I am inside Home URL !!
<br>
<%

	String name = (String)request.getAttribute("name") ;
	Integer id = (Integer)request.getAttribute("id") ;

%>

<h1> Your Name Is : <%=name %></h1>
<h1> Your ID Is : <%= id %></h1>
</body>
</html>
