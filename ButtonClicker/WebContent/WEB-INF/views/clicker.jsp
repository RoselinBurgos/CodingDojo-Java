<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/ButtonClicker/Counter"><input type="submit" value="Click Me"></form>

	<h2>You have clicked this button <%= (Integer) request.getSession().getAttribute("count") %> times.</h2>
</body>
</html>