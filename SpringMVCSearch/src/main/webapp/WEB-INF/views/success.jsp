<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>${ student}</h1>
	<hr>
	<h4>Student Name is ${student.name }</h4>
	<h4>Student Id is ${student.id }</h4>

	<h4>Student Date of Birthdate is ${student.dob }</h4>

	<h4>Student Courses is ${student.courses }</h4>
	<h4>Student Gender is ${student.gender }</h4>
	<h4>Student Type is ${student.type }</h4>
	<hr>
	<h4>Student Street is ${student.address.street }</h4>
	<h4>Student City is ${student.address.city }</h4>



</body>
</html>