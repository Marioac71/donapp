<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="donapp.servlet.Login"%>
    <% 
    try{
    	boolean x=(boolean)session.getAttribute("loggato");
    	System.out.println("x = "+x);
    	if(x) {
    		System.out.println(x);
    		%>
    		<jsp:forward page="profilo.jsp"/>
   		<% }
    	 %>
    		
    <% 

    }
    catch(Exception e){
    	e.printStackTrace();
    session.setAttribute("loggato",false);
    } 
    %>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>
		<link rel="stylesheet" href="stile.css" type="text/css">
	</head>
	
	<body>
	<div align="center">
	<img alt="Logo Accenture" src="accenture-technologyLogo.png">
	<p id="welcome" class="bor">Benvenuti in DonApp! </p>
	</div>
<div class="login-page">

  <div class="form">
  
   <form action="Login" method="post">
    
    <p class="bor">Username: </p>
      <input type="text" id="user" name="username" required placeholder="User" >
      <p class="bor">Password: </p>
      <input type="password" id="password" name="password" required placeholder="Password">
      <input type="submit" value="LogIn">
      <p class="message">Not registered? <a href="#">Create an account</a></p>
       
    </form>
  </div>
</div>
	</body>
</html>
