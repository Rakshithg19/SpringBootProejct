<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<style type="text/css">
.content {
	height: 500px;
}
.body-class{
	min-height:470px;
}
body  {
  background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ8adZNLzehV-tnnxgdzU01-jEMASGLrVVvqg&usqp=CAU");
   background-repeat: no-repeat;
  background-size: 1500px 600px;
  }
  .footer {
   position: fixed;
   left: 0;
   bottom: 0;
   height: 40px;
   width: 100%;
   background-color: black;
   color: white;
   text-align: center;

}
</style>
</head>
<body>
	<nav class="navbar navbar-dark bg-dark"> <span
		class="navbar-brand mb-0 h1"><h2 style="color: orange">X-workz</h2>
	</span></nav>
	<div class="body-class">
	<div class="row col-sm-12 justify-content-center">
		<h3>From : ${from} , Message:  ${msg}</h3>
	</div>
	</div>
	<div class="footer">
  <small style="color: white"><b>@ 2020 Copyright &copy;
				xworkz.com</b></small>
</div>
			

</body>
</html>
