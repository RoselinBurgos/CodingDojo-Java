<!DOCTYPE html>
<html lang="en">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title></title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/style.css" rel="stylesheet">
</head>
<body>
<div>
    <h2>Submitted Info</h2>
    <p>Name: <c:out value="${name}"></c:out></p>
    <p>Dojo Location: <c:out value="${location}"></c:out></p>
    <p>Favorite Language: <c:out value="${language}"></c:out></p>
    <p>Comment: <c:out value="${comment}"></c:out></p>
</div>
</body>
</html>