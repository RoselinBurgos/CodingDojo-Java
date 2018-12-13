<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Create a Pet!</title>
	
</head>
<body>

<h3>Make a dog!</h3>
	<div class="dogbox">
		
		<form action="dogcontroller" method=get style="display: inline-block">
        	<fieldset>
          		<legend>Dog</legend>
					<input name="name" placeholder="Name">
					<br>
					<input name="breed" placeholder="Breed">
					<br>
					<input name="weight" placeholder="Weight (lb)">
					<br>
					<br>
					<button type="submit">Make a Dog!</button>
		</fieldset> 
		</form>
	</div>
	
	<h3>Make a cat!</h3>
	<div class="dogbox">
		
		<form action="catcontroller" method=get style="display: inline-block" >
        	<fieldset>
          		<legend>Cat</legend>
					<input name="name" placeholder="Name">
					<br>
					<input name="breed" placeholder="Breed">
					<br>
					<input name="weight" placeholder="Weight (lb)">
					<br>
					<br>
					<button type="submit">Make a cat!</button>
			 </fieldset>
		</form>
	</div>
	

</body>
</html>