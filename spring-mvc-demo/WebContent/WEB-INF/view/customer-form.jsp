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
<form:form action="processForm" modelAttribute="customer">

	First name: <form:input type="text" path="firstName" />
	
	<br><br>
	Last name (*): <form:input type="text" path="lastName" />
	<form:errors path="lastName" cssClass="error"></form:errors>
	<br><br>
	Free passes : <form:input path="freePasses"/>
	<form:errors path="freePasses" cssClass="error"></form:errors>
	<br><br>
	Code postal : <form:input path="codePostal"/>
	<form:errors path="codePostal" cssClass="error"></form:errors>
	<br><br>
	
	Course code : <form:input path="courseCode"/>
	<form:errors path="courseCode" cssClass="error"></form:errors>
	<br><br>
	
	<input type="submit" value="Send query">
	 
</form:form>
</body>
</html>