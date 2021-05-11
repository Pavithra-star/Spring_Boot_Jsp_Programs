<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page isErrorPage="true" %>
<h4>This is ShowErrors.jsp page showing the errors of ErrorPage.jsp</h4>
The following errors ocured:<hr>
<%exception.printStackTrace
(new java.io.PrintWriter(out));%>
</body>
</html>