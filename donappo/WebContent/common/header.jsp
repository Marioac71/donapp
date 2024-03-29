<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <!DOCTYPE html>
  <header class="main_menu home_menu">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-lg-12">
                    <nav class="navbar navbar-expand-lg navbar-light">
                        <a class="navbar-brand" href="indexT.jsp"> <img src="assets/img/LogoDonApp.png" alt="logo" width="184px"> </a>
                        <button class="navbar-toggler" type="button" data-toggle="collapse"
                            data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation">
                            <span class="menu_icon"><i class="fas fa-bars"></i></span>
                        </button>

                        <div class="collapse navbar-collapse main-menu-item" id="navbarSupportedContent">
                            <ul class="navbar-nav">
                                <li class="nav-item">
                                    <a class="nav-link" href="indexT.jsp"><i class="fas fa-home"></i> Home</a>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="blog.html" id="navbarDropdown_1"
                                        role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <i class="fas fa-list-ul"></i> Prodotti
                                    </a>
                                    <div class="dropdown-menu" aria-labelledby="navbarDropdown_1">
                                        <a class="dropdown-item" href="searchOggetti"> categoria prodotti</a>
                
                                        
                                    </div>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="blog.html" id="navbarDropdown_3"
                                        role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <i class="fas fa-user"></i> Profilo
                                    </a>
                                    <div class="dropdown-menu" aria-labelledby="navbarDropdown_2">
                                        <a class="dropdown-item" href="loginT.jsp"> login</a>
                                        <a class="dropdown-item" href="profiloT.jsp">Il tuo profilo</a>
                                        <a class="dropdown-item" href="GetAllMyOggetti">I tuoi oggetti </a>
                                        <a class="dropdown-item" href="GetAllPrenotation">Le tue prenotazioni</a>
                                       
                                    </div>
                                </li>
                                   <li class="nav-item">
                                    <a class="nav-link" href="aggiungiT.jsp">
                                    <i class="fas fa-plus-square"></i> Inserisci</a>
                                   </li>	
                       
                                <li class="nav-item">
                                    <a class="nav-link" href="Logout">
                              <i class="fas fa-sign-out-alt"></i> LogOut</a>
                                </li>
                            </ul>
                        </div>
                        <div class="hearer_icon d-flex">
                            <a id="search_1" href="javascript:void(0)"><i class="fas fa-search"></i> </a>
                       
                                </div>
                                
                                <jsp:useBean id="utent" scope="session" class="donapp.model.Utente"/>
            						<jsp:setProperty property="*" name="utent" />
                               <a href="profiloT.jsp"><h6 align="right">  Ciao, <jsp:getProperty property="username" name="utent" /> </h6></a>
                                <!-- <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <div class="single_product">
    
                                    </div>
                                </div> -->
                                
                          
                        
                    </nav>
                </div>
            </div>
        </div>
        <div class="search_input" id="search_input_box">
            <div class="container ">
                <form action="barraRicerca" class="d-flex justify-content-between search-inner" method="post" >
                    <input type="text" class="form-control" id="search_input" name="campo" placeholder="Search Here">
                    <button type="submit" class="btn"></button>
                    <span class="ti-close" id="close_search" title="Close Search"></span>
                </form>
            </div>
        </div>
    </header>