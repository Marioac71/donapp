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
	<form action="InsOggetto" method="post" enctype="multipart/form-data">
		<input type="file" name="foto" placeholder="url fotografia" value="">
		<input type="text" name="nome" placeholder="Nome oggetto" value="">
		<input type="text" name="colore" placeholder="Colore oggetto" value="">
		<input type="text" name="descrizione" placeholder="Descrivi il tuo oggetto (se ne sei capace)" value="">
		<input type="text" name="luogoritiro" placeholder="Dove" value="">
		<input type="text" name="disponibilita" placeholder="Disponibilità" value="">
		<input type="text" name="idcategoria" placeholder="Categoria'" value="">
		<input type="submit" value="Aggiungi">
	</form> 
</body>
</html>