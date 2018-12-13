<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Current visit count</title>
</head>
<body>

	<h1> You have visited <a href="/"><c:out value="${count}"/></a> times</h1>
	<h4><a href ='/'> Test another visit </a></h4>
	<h4><a href = '/reset'> Start over</a></h4>

</body>
</html>