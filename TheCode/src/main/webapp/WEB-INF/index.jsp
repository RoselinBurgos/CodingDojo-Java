<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/style.css">
	<meta charset="UTF-8">
	<title>Secret Code</title>
</head>
<body>
<br>
<br>
<br>
<p class = "red"><c:out value ="${error}" /></p>
<br>
<h3>What is the code?</h3>
<form method="POST" action="/guessed">
    <label><input type="text" name="wordguessed"></label>
    <button>Try Code</button>
</form>

</body>
</html>