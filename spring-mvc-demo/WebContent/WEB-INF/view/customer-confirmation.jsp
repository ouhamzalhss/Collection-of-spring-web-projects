<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer confirmation</title>
</head>
<body>

The student is confirmed : ${customer.firstName } ${customer.lastName }
<br>
the free Passes:  ${customer.freePasses }

<br>
the code Postal:  ${customer.codePostal }


<br>
the Course code:  ${customer.courseCode }

</body>
</html>