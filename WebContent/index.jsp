<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form action="LoginServlet" method="post">
		Login id/email id: <input type="text" name="Login"><br>
		Password: <input type="text" name="password"> 
		<input type="hidden" name="password" value="8601"> 
			<input type="hidden" name="select" value="Login"> 
			<input type="submit" value="submit" class="btn btn-default"></input>
			

	</form>
	<form action="LoginServlet" method="post" >
		<input type="hidden" name="select" value="notLogin"> 
		<input	type="submit" value="notsubmit" class="btn btn-default"></input>
	</form>
</body>
</html>