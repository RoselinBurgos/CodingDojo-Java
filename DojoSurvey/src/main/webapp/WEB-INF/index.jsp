<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Dojo Survey Index</title>
</head>
<body>
<form method="POST" action="/info">
    <label>Your Name: <input type="text" name="name"></label>
    <br>
    <br>
   Location:  <select name="location">
  		<option value="SanJose">San Jose</option>
  		<option value="Burbank">Burbank</option>
  		<option value="Seattle">Seattle</option>
  		<option value="Tulsa">Tulsa</option>
	</select>
	<br>
	<br>
	Language:  <select name="language">
  		<option value="Python">Python</option>
  		<option value="Java">Java</option>
  		<option value="HTML">HTML</option>
  		<option value="Mean">Mean</option>
	</select>
	<br>
	<br>
Comment (optional) : <textarea name="comment" style="font-family:sans-serif;font-size:1em;"></textarea>
	<br>
	<br>  
    <button>Submit</button>
</form>

</body>
</html>