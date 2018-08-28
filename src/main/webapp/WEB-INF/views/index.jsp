<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home page</title>
</head>
<body>

<h1>${index}</h1>
<h1>Hotel Search</h1>

<h2>Cities:</h2>

<form action="/results" method="post">
	<select name = "city">
		<c:forEach var="city" items="${hotelCities}">
			<option value="${city}">${city}</option>
		</c:forEach>
	</select>
<input type="submit" value="Go!">
</form> 
 
</body>
</html>