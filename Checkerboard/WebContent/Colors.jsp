<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8">
	<title>Java Checkerboard</title>
	<link rel="stylesheet" type="text/css" href="Styles.css">

<!--http://localhost:8080/Checkerboard/Colors.jsp?width=10&height=5  -->

</head>
<body>

<% String width = request.getParameter("width"); %>
<% String height = request.getParameter("height"); %>
<%if(width == null){ %>
<%width = "8"; %>
<%} %>
<%if(height == null){ %>
<%height = "8"; %>
<%} %>
<% 
%>
<%! public String[] rowSwitch(int r){
	String one;
	String two;
	if(r % 2 == 0){
		one = "<div class='red'></div>";
		two = "<div class='blue'></div>";
	}
	else{
		one = "<div class='blue'></div>";
		two = "<div class='red'></div>";
	}
	String[] order = {one, two};
	return order;
} %>	
	

<h1>Checkerboard: <%= width %> width X <%= height %> height</h1>
<%for (int i=0;i<Integer.parseInt(height);i++){%>
	<div id="row">
	<%String[] row = rowSwitch(i); %>
	<%for (int k=0;k<Integer.parseInt(width);k++){ %>
		<%if(k % 2 == 0){ %>
		<%= row[0] %> 
		<%} %>
		<%if(k % 2 != 0){ %>
		<%= row[1] %>  
		<%} %>
	<%} %>
	</div>
<%} %>



</body>
</html>