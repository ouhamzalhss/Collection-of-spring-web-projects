<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student confirmation</title>
</head>
<body>
The student is confirmed : ${student.firstName } ${student.lastName }
<br>
The country : ${student.country }
<br>
The favorite language : ${student.favoriteLang }
<br>
The Operating system : 
<ul>
	<c:forEach var="temp" items="${student.os }">
	  <li>${temp }</li>
	</c:forEach>
</ul>

</body>
</html>