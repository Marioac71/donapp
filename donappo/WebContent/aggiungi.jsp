<%@page import="donapp.dao.impl.OggettoDaoImpl"%>
<%@page import="com.mysql.cj.x.protobuf.MysqlxCrud.InsertOrBuilder"%>
<%@page import="donapp.model.Oggetto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserisci oggetto</title>
</head>
<body>
	<form action="" method="post">
		<input type="text" name="foto" placeholder="url fotografia" value="">
		<input type="text" name="nome" placeholder="Nome oggetto" value="">
		<input type="text" name="colore" placeholder="Colore oggetto" value="">
		<input type="text" name="descrizione" placeholder="Descrivi il tuo oggetto (se ne sei capace)" value="">
		<input type="text" name="luogoRitiro" placeholder="Dove" value="">
		<input type="text" name="disponibilita" placeholder="Disponibilità" value="">
		<input type="text" name="idProprietario" placeholder="Tuo ID" value="">
		<input type="text" name="idPrenotante" placeholder="ID prenotante" value="">
		<input type="text" name="idCategoria" placeholder="Categoria'" value="">
	</form> 
</body>
</html>