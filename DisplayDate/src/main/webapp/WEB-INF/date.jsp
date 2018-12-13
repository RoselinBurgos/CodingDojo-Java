<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.Date" import="java.text.SimpleDateFormat"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
		<title>Date</title>

	    <link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="js/app.js"></script>
        

</head>
<body>
	<%
		String pattern ="EEEEE, 'the' dd 'of' MMMMM, yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	%>
	<h1 class=date>Today's date is <%= simpleDateFormat.format(new Date()) %></h1>
	
	<h6> <a href ="/">Back</a> </h6>
</body>
</html>