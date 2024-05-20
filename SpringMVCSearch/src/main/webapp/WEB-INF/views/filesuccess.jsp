<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Success Page !!!!</h1>
<hr>
<h3>${msg}</h3>

<img alt="profile Image" src="<c:url value="/resources/images/${filename }"  /> ">
</body>
</html>