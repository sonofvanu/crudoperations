
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style type="text/css">
.navbar {
	width: 100vw;
	height: 10vh;
	display: flex;
}

.logopart {
	width: 20vw;
	height: 10vh;
	background-color: red;
}

.linkpart {
	width: 80vw;
	height: 10vh;
	background-color: yellow;
}

.leftcontent {
	width: 50vw;
	height: 80vh;
	background-color: lightgreen;
}

.rightcontent {
	width: 50vw;
	height: 80vh;
	background-color: lightblue;
}

.formcontent {
	display: flex;
	width: 100vw;
	height: 80vh;
}

.signupform {
	padding-left: 5vw;
}

table tbody tr td {
	border: 2px;
	border-width: 2px;
	border-color: red;
	border-style: double;
}

tr td {
	padding-left: 20px;
}
</style>
</head>
<body>

	<div class="navbar">
		<div class="logopart"></div>
		<div class="linkpart"></div>
	</div>
	<div class="formcontent">
		<div class="leftcontent">


			<form:form class="signupform" modelAttribute="userModelAgent"
				action="signup">
				<label>Username</label>
				<form:input type="text" path="userName"></form:input>
				<br>
				<label>Email</label>
				<form:input type="email" path="userEmail"></form:input>
				<br>
				<label>Contact</label>
				<form:input type="text" path="userContact"></form:input>
				<br>
				<label>Age</label>
				<form:input type="number" path="userAge"></form:input>
				<br>
				<label>Password</label>
				<form:input type="password" path="userPassword"></form:input>
				<br>
				<label>Confirm Password</label>
				<form:input type="password" path="userConfirmPassword"></form:input>
				<br>
				<label>Address</label>
				<form:input type="text" path="userAddress"></form:input>
				<br>
				<label>City</label>
				<form:input type="text" path="userCity"></form:input>
				<br>
				<input type="submit" class="btn btn-primary">
			</form:form>
		</div>


		<div class="rightcontent">
			<table>
				<tbody style="border: 2px; border-width: 2px; border-color: red;">
					<tr>
						<td>UserName</td>
						<td>UserEmail</td>
						<td>UserCity</td>
						<td>Delete</td>
						<td>Edit</td>
					</tr>

					<c:forEach var="usr" items="${allUsers}">
						<tr>
							<td>${usr.getUserName()}</td>
							<td>${usr.getUserEmail()}</td>
							<td>${usr.getUserCity()}</td>
							<td><a href="deleteuser/${usr.getUserName()}/"><button class="btn btn-danger">DELETE</button></a></td>
							<td><button class="btn btn-primary">EDIT</button></td>
						</tr>
					</c:forEach>

				</tbody>
			</table>

		</div>
	</div>






	<div class="footer"></div>

</body>
</html>