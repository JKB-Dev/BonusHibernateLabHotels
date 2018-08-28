<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results Page</title>
</head>
<body>

<h1> Results for ${city}</h1>

<table border="1">
	<tr>
	<c:forEach var="hotel" items="${hotelResults}">  <!-- make list -->
		<tr>
			<td> ${ hotel.name }</td>
			<td> ${ hotel.pricePerNight }</td>
		</tr>	
	</c:forEach>
</table>
<br>

<a href="/">Start a new search</a>

</body>
</html>