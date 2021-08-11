<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8"/>
		<meta name = "viewport"content="width=device-width , initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
		
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

	<title>Instagram | Kafeel</title>
</head>

<body style="background-color: gray;">
<div class="container-fluid">
	<header class="text-center bg-danger">
		<img alt="InstaLogo" src="https://img.icons8.com/fluent/48/000000/instagram-new.png"><h2 style="display:inline;" class="display-2">Instagram Profile Details</h2>
		<span class="text-success">Developed by Kafeelur Rahman T K</span>
	</header>
	<main style="margin-top: 100px" class="container text-center mt-40">
		<form action="profile" class="bg-primary" method="post">
			<br><br><img alt="userLogo" src="https://img.icons8.com/android/24/000000/user.png"> 
			<input type="text" name="username" style="color:black;" placeholder="Username" required><br><br>
			<input type="submit" value="Check" class="btn btn-success">
		</form>
	</main>
</div>
</body>
</html>