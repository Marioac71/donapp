<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="zxx">

<head>
  <%@ include file = "common/head.jsp" %>
</head>

<body>
  <!--::header part start::-->
  <%@ include file = "common/header.jsp" %>
  <!-- Header part end-->


  <!--================Home Banner Area =================-->
  <!-- breadcrumb start-->
  <section class="breadcrumb breadcrumb_bg">
    <div class="container">
      <div class="row justify-content-center">
        <div class="col-lg-8">
          <div class="breadcrumb_iner">
            <div class="breadcrumb_iner_item">
              <h2>Il tuo profilo</h2>
              <p>Home <span>-</span>Profilo</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- breadcrumb start-->

  <!--================Cart Area =================-->
  <section class="cart_area padding_top">
    <div class="container">
      <div class="cart_inner">
        <div class="table-responsive">
          <table class="table">

            <thead>
            <h3><b>I tuoi dati</b></h3> 
            <jsp:useBean id="utente" scope="session" class="donapp.model.Utente"/>
            <jsp:setProperty property="*" name="utente" />
              <tr>
                <th scope="col"><h3><b><Center></Center></b></h3></th>
                <th scope="col"><h3><b><Center></Center></b></h3></th>     
              </tr>
            </thead>
            <tbody>
            <tr>
                <td>
                  <h4>Username:</h4> 
                </td>
                <td>   
                <jsp:getProperty property="username" name="utente" />         
                </td>
              </tr>
              <tr>
                <td>
                  <h4>Nome:</h4>
                </td>
                <td>   
                <jsp:getProperty property="nome" name="utente" />          
                </td>
              </tr>
              <tr>
                <td>
                  <h4>Cognome:</h4>
                </td>
                <td>
                <jsp:getProperty property="cognome" name="utente" />
                </td>
              </tr>
              <tr>
                <td>
                  <h4>Email:</h4>
                </td>
                <td>
                <jsp:getProperty property="email" name="utente" />
                </td>
              </tr>
             
            </tbody>
          </table>
          
        </div>
      </div>
  </section>
  
  <!--================End Cart Area =================-->

  <!--::footer_part start::-->
 	<%@ include file="common/footer.jsp" %>
  <!--::footer_part end::-->

  <!-- jquery plugins here-->
  <!-- jquery -->
  <%@ include file = "common/script.jsp" %> 
</body>

</html>