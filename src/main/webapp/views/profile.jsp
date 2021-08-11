<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
				<title>Details</title>
</head>
<body style="background-color: orange;">
	<div class="container-fluid">
		<h1 class="display-1 text-center bg-success">Profile Details</h1>
		<table class="table table-bordered  table-striped table-hover text-center font-weight-bold" style="background-color: darkgray;">
			<tr >
				<td colspan="2"><center><span>Profile</span><br><img alt="userprofile" src="${profile.getProfileUrl()} " style="border-radius: 10px;"></center></td>
			</tr>
			<tr>
				<td>Username</td>
				<td>${profile.getUsername()}</td>
			</tr>
			<tr>
				<td>Profile ID</td>
				<td>${profile.getProfileID()}</td>
			</tr>
			<tr>
				<td>User Bio</td>
				<td>${profile.getProfileBio()}</td>
			</tr>
			<tr>
				<td>Followers</td>
				<td>${profile.getFollowersCount()}</td>
			</tr>
			<tr>
				<td>Following</td>
				<td>${profile.getFollowingCount()}</td>
			</tr>
			
			<tr>
			<td colspan=2><center>
				<a href="followers" >
					<button class="btn btn-success" >Check followers name</button>
				</a>
				</center>
			</td>
			</tr>
			<tr>
			<td colspan=2><center>
				<center>
					<a href="${profile.getProfileUrl()}" target=_blank>
						<button class="btn btn-success">Download Profile Photo</button>
					</a>
				</center>
			</td>
			</tr>
			
		</table>
	</div>
</body>
</html>