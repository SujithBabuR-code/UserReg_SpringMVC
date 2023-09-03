<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	margin: 0px;
	font-family: 'Bricolage Grotesque', sans-serif;
}

#main-sec {
	display: flex;
	width: 100%;
	height: 100vh;
	justify-content: center;
	align-items: center;
	background: linear-gradient(120deg, #2980b9, #8e44ad);
}

#main-sec input {
	border-radius: 5px;
	width: 80%;
	margin: 10px;
	height: 30px;
}

#main-sec input::placeholder {
	color: black;
	font-size: 15px;
	text-align: center;
	font-weight: bolder;
}

#form-sec {
	color: white;
	width: 30vw;
}

#form-sec label {
	margin: 2rem;
	margin-left: 20px;
}

#form-sec select {
	margin-left: 20px;
	width: 50%;
	height: 25px;
}

#form-sec button {
	width: 30%;
	margin-left: 20px;
	height: 40px;
	border-radius: 50px;
}

#form-sec button:hover {
	cursor: pointer;
	background-color: black;
	color: white;
}
</style>
</head>
<body>
	<div id="main-sec">
		<form action="insert" id="form-sec">
			<h1>User Registration Form</h1>
			<!-- <h3>Please Fill your details</h3> -->
			<input type="text" name="name" placeholder="enter your name"
				required="required"><br /> <input type="email" name="email"
				placeholder="enter your EMAIL" required="required" /><br /> <input
				type="tel" name="mobileNum" placeholder="enter your NUMBER"
				required="required" /><br /> <input type="date" name="date"
				placeholder="enter your DATE OF BIRTH" required="required" /><br />
			<label for="location">Choose a Location</label><br /> <select id=""
				name="location" required="required">
				<option>any location</option>
				<option>Bangalore</option>
				<option>Hyderabad</option>
				<option>Chennai</option>
				<option>New Delhi</option>
			</select> <br /> <br /> <input type="file" name="file"> <br> <br>
			<button type="reset">Reset</button>
			<button type="submit">Submit</button>
		</form>
	</div>
</body>
</html>