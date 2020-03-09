<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="donapp.model.Utente"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Ciao</h1>
<jsp:useBean id="utente" scope="session" class="donapp.model.Utente" />
<jsp:setProperty property="*" name="utente"/>
<jsp:getProperty property="username" name="utente"/>
<form action="Logout" method="post">
<input type="submit" value="Logout"></form>
</body>
</html>