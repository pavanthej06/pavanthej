<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>
	<hr size="4"></hr>
	<h1>project Manager Dashboard</h1>
	<br>
	<br>
	<table>
	<tr>
	<td colspan="4" align="left">
	<form>
	<input type="submit" value="new request" style="background-color:red; color:white; font-size: xx-Large;"/>
	</form>
	</td>
	</tr>
	</table>
	<br>
	<table>
	<tr style="background-color: lime;">
	<td>Request ID</td>
	<td>pm</td>
	<td>vertical</td>
	<td>Technology</td>
	<td>Date Required</td>
	<td>Approx participants</td>
	<td>location</td>
	<td>type</td>
	</tr>
	</table>
	<br>
	<table>
	
<c:forEach var="tro" items="${all}">
<tr>
	<td>${tro.request_id}</td>
	<td>${tro.request_pm_name}</td>
	<td>${tro.request_pm_vertical}</td>
	<td>${tro.request_technology}</td>
	<td>${tro.request_date}</td>
	<td>${tro.approx_participants}</td>
	<td>${tro.training_location}</td>
	<td>${tro.training_type}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>
