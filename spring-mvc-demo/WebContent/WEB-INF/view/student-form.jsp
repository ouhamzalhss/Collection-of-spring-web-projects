<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
<style type="text/css">
.error { color: red}
</style>
</head>
<body>
<i>Asterik (*) means required !</i>
<form:form action="processForm" modelAttribute="student">

	First name: <form:input type="text" path="firstName" />
	
	<br><br>
	Last name (*): <form:input type="text" path="lastName" />
	<form:errors path="lastName" cssClass="error"></form:errors>
	
	<br><br>
	Country: <form:select path="country">
	   <form:options items="${student.countryOptions }"></form:options>
	</form:select>
	
	<br><br>
	Favorite language: <br>
	Java: <form:radiobutton path="favoriteLang" value="JAVA" />
	PHP: <form:radiobutton path="favoriteLang" value="PHP" />
	
	<br><br>
	Operating System: <br>
	Linux: <form:checkbox path="os" value="linux" />
	Wins: <form:checkbox path="os" value="wins" />
	
	<br><br>
	<input type="submit" value="Send query">
	 
</form:form>
</body>
</html>