<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!--::IMPORTARE CSS::-->
<%@ include file="common/head.jsp"%>
<meta charset="ISO-8859-1">
<title>Insert Product</title>
</head>
<body>
	<!--::IMPORTARE HEADER::-->
	<%@ include file="common/header.jsp"%>
	<section class="login_part padding_top">
		<div class="container">
		      <div class="row">
        <div class="col-12">
          <h2 class="contact-title">Inserisci il tuo prodotto</h2>
        </div>
        <div class="col-lg-8">
          <form class="form-contact contact_form" action="InserimentoOggetto" method="post"enctype="multipart/form-data" id="contactForm"
          novalidate="novalidate">
            <div class="row">
            	              <div class="col-sm-6">
                <div class="form-group">
                  <input class="form-control" name="nome" id="name" type="text" onfocus="this.placeholder = ''"
                    onblur="this.placeholder = 'Prodotto'" placeholder='Prodotto' value="">
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <input class="form-control" name="colore" id="colore" type="text" onfocus="this.placeholder = ''"
                    onblur="this.placeholder = 'Colore'" placeholder='Colore' >
                </div>
              </div>
              <div class="col-12">
                <div class="form-group">

                  <textarea class="form-control w-100" name="descrizione" id="descrizione" cols="30" rows="9"
                    onfocus="this.placeholder = ''" onblur="this.placeholder = 'Descrizione Prodotto'"
                    placeholder='Descrizione Prodotto' value=""></textarea>
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <input class="form-control" name="luogoritiro" id="luogoritiro" type="text" onfocus="this.placeholder = ''"
                    onblur="this.placeholder = 'Luogo ritiro'" placeholder='Luogo ritiro' value="">
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <input class="form-control" name="disponibilita" id="disponibilita" type="date" onfocus="this.placeholder = ''"
                    onblur="this.placeholder = 'Disponibile dal '" placeholder='Disponibile dal ' value="">
                </div>
              </div>
             
              <div class="col-sm-6">
               <div class="wrapper" >
               <select name="idcategoria" id="idcategoria" class="form-control">			           
                <option disabled selected>Categoria</option>
                <option value=1>Casa</option>
                <option value=2>Abbigliamento</option>
                <option value=3>Elettronica</option>
                <option value=4>Sport</option>
            </select>
                  </div>
                </div>
              <div class="col-sm-6">
              
                <div class="form-group">
                  <input class="form-control" name="img" id="img" type="file" accept="image/*" onfocus="this.placeholder = ''"
                    onblur="this.placeholder = 'Aggiungi foto'" placeholder='Aggiungi foto'>
                </div>
              </div>
              
            </div>
            <div class="form-group mt-3">
             <input class="btn_3 button-contactForm"type="submit" value="Aggiungi">
                         </div>
          </form>
        </div>
        <div class="col-lg-4">
         
                 
                    <img height="500px" width="1000px" src="assets\img\2.jpeg">
                
                        <div class="login_part_text_iner">

                        </div>
                   
               
        </div>
      </div>
     </div>
    </section>

					<!--::footer_part start::-->
					<%@ include file="common/footer.jsp"%>
					<!--::footer_part end::-->
					<!-- importare script -->
					 <script src="assets/js/jquery-1.12.1.min.js"></script>
    <!-- popper js -->
    <script src="assets/js/popper.min.js"></script>
    <!-- bootstrap js -->
    <script src="assets/js/bootstrap.min.js"></script>
    <!-- easing js -->
    <script src="assets/js/jquery.magnific-popup.js"></script>
    <!-- swiper js -->
    <script src="assets/js/swiper.min.js"></script>
    <!-- swiper js -->
    <script src="assets/js/masonry.pkgd.js"></script>
    <!-- particles js -->
    <script src="assets/js/owl.carousel.min.js"></script>
    <script src="assets/js/jquery.nice-select.min.js"></script>
    <!-- slick js -->
    <script src="assets/js/slick.min.js"></script>
    <script src="assets/js/jquery.counterup.min.js"></script>
    <script src="assets/js/waypoints.min.js"></script>
    <script src="assets/js/contact.js"></script>
    <script src="assets/js/jquery.ajaxchimp.min.js"></script>
    <script src="assets/js/jquery.form.js"></script>
    
    <script src="assets/js/mail-script.js"></script>
    <!-- custom js -->
    <script src="assets/js/custom.js"></script>
    
    <!-- importare file icone -->
    <script src="https://kit.fontawesome.com/7eb2e67776.js" crossorigin="anonymous"></script>
</body>
</html>