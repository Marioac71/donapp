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

  <!-- breadcrumb start-->

  <!-- breadcrumb start-->
  <!--================End Home Banner Area =================-->

  <!--================Single Product Area =================-->
  <div class="product_image_area section_padding">
    <div class="container">
      <div class="row s_product_inner justify-content-between">
        <div class="col-lg-7 col-xl-7">
          <div class="product_slider_img">
          <jsp:useBean id="oggetto" scope="session" class="donapp.model.OggettoDto"/>
          <jsp:setProperty property="*" name="oggetto" />
            <div id="vertical">
             <div data-thumb="<jsp:getProperty property="foto" name="oggetto"/>" class="lslide active" style="height: 450px; margin-bottom: 0px;">
                <img src="<jsp:getProperty property="foto" name="oggetto"/>">
                </div>
            </div>
          </div>
        </div>
        
           
        <div class="col-lg-5 col-xl-4">
          <div class="s_product_text">
         
            <h3><jsp:getProperty property="nome" name="oggetto"/></h3>
          
            <ul class="list">
              <li>
                <a class="active" >
                  <span>Categoria:</span><jsp:getProperty property="nomeCat" name="oggetto"/></a>
              </li>
              <li>
              
                Disponibile dal:  <a class="active"><jsp:getProperty property="disponibilita" name="oggetto"/></a>
              </li>
              
               <li>
              
                Proprietario:  <a class="active"><jsp:getProperty property="idProprietario" name="oggetto"/></a>
              </li>
              

            </ul>
            <p>
              <jsp:getProperty property="descrizione" name="oggetto"/>
            </p>
            <div class="card_area d-flex justify-content-between align-items-center">
              <form action="PrenotaOggetto" method="get">
             <input type="hidden" name="idogge" value="<jsp:getProperty property="idOggetto" name="oggetto"/>">
              <input class="btn_3 button-contactForm" type="submit" value="Prenota">
              
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!--================End Single Product Area =================-->

  <!--================Product Description Area =================-->
  
  <!--================End Product Description Area =================-->

  <!-- product_list part start-->

  <!-- product_list part end-->

  <!--::footer_part start::-->
 	<%@ include file = "common/footer.jsp" %> 
  <!--::footer_part end::-->

  <!-- jquery plugins here-->
  <!-- importo gli script -->
	<%@ include file = "common/script.jsp" %> 
</body>

</html>