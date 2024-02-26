<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>

<body>

	<div class="container">
		<div class="row">
			<div class="col m6 offset-m3">
				<h2>Register Here</h2>
				<h5 id="msg"></h5>
				<form class="col s12" action="regi" id="myform">
					<input type="text" name="uname" placeholder="Enter Name...">
					<input type="email" name="umail" placeholder="Enter Mail...">
					<input type="password" name="upass" placeholder="Enter Password">
	
					<div class="btn">
						<span>File</span> <input name="text" type="file">
					</div>
					<div class="file-path-wrapper">
						<input class="file-path validate" type="text">
					</div>

					<input type="submit">
				</form>
				</div>
				<div class="preloader-wrapper small active" id="load"
					style="display: none;">
					<div class="spinner-layer spinner-green-only">
						<div class="circle-clipper left">
							<div class="circle"></div>
						</div>
						<div class="gap-patch">
							<div class="circle"></div>
						</div>
						<div class="circle-clipper right">
							<div class="circle"></div>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>
	<script>
	$(document).ready(function(){
		console.log("page is ready");
		
		$("#myform").on("submit", function(e){
			e.preventDefault();
			
//			var f = $(this).serialize();
			var f=new FormData(this);
			console.log(f);
			
			$("#load").show();
			$("#myform").hide();
			
			$.ajax({
				url: "regi",
				data: f,
				type: "POST",
				success: function(data, textStatus, jqXHR){
					console.log(data);
					console.log("success");
					$("#load").hide();
					$("#myform").show();
					$("#msg").html("User Registered Succesfully")
				},
				error: function(jqXHR, textStatus, errorThrown){
					console.log(errorThrown);
					console.log("error");
					$("#load").hide();
					$("#myform").show();
					$("#msg").html("Something went wrong on server")

				},
				processData:false,
				contentType:false;
			});
		});
	});
</script>

</body>
</html>