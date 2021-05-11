<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Price Calculation</h2>
	<sf:form method="get" modelAttribute="ProductData">
Id <br />
		<sf:input path="id" />
		<p />
Base Price<br />
		<sf:input path="discount" />
		<p></p>
Discount Rate<br />
		<sf:input path="discount" />
		<p></p>
NetPrice Rate<br />
		<sf:input path="netPrice" />
		<p></p>
		<input type=submit Value="Calculate" />
		<p></p>
		<h3>${productDao.netPrice}</h3>
	</sf:form>
</body>
</html>