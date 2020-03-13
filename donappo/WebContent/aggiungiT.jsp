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
          <form class="form-contact contact_form" action="contact_process.php" method="post" id="contactForm"
            novalidate="novalidate">
            <div class="row">
            	              <div class="col-sm-6">
                <div class="form-group">
                  <input class="form-control" name="name" id="name" type="text" onfocus="this.placeholder = ''"
                    onblur="this.placeholder = 'Prodotto'" placeholder='Prodotto'>
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <input class="form-control" name="email" id="email" type="email" onfocus="this.placeholder = ''"
                    onblur="this.placeholder = 'Colore'" placeholder='Colore'>
                </div>
              </div>
              <div class="col-12">
                <div class="form-group">

                  <textarea class="form-control w-100" name="message" id="message" cols="30" rows="9"
                    onfocus="this.placeholder = ''" onblur="this.placeholder = 'Descrizione Prodotto'"
                    placeholder='Descrizione Prodotto'></textarea>
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <input class="form-control" name="name" id="name" type="text" onfocus="this.placeholder = ''"
                    onblur="this.placeholder = 'Inserisci nome'" placeholder='Inserisci nome'>
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <input class="form-control" name="email" id="email" type="email" onfocus="this.placeholder = ''"
                    onblur="this.placeholder = 'Inserisci email'" placeholder='Inserisci email'>
                </div>
              </div>
              <div class="col-12">
                <div class="form-group">
                  <input class="form-control" name="subject" id="subject" type="text" onfocus="this.placeholder = ''"
                    onblur="this.placeholder = 'Indirizzo di ritiro'" placeholder='Indirizzo di ritiro'>
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <input class="form-control" name="subject" id="subject" type="file" onfocus="this.placeholder = ''"
                    onblur="this.placeholder = 'Aggiungi foto'" placeholder='Aggiungi foto'>
                       <div class="form-group mt-3">
              					<a href="#" class="btn_3 button-contactForm" >Aggiungi foto</a>
           			 </div>
                </div>
              </div>
            </div>
            <div class="form-group mt-3">
              <a href="#" class="btn_3 button-contactForm" >Inserisci</a>
            </div>
          </form>
        </div>
        <div class="col-lg-4">
          <div class="media contact-info">
            <span class="contact-info__icon"><i class="ti-home"></i></span>
            <div class="media-body">
              <h3>Buttonwood, California.</h3>
              <p>Rosemead, CA 91770</p>
            </div>
          </div>
          <div class="media contact-info">
            <span class="contact-info__icon"><i class="ti-tablet"></i></span>
            <div class="media-body">
              <h3>00 (440) 9865 562</h3>
              <p>Mon to Fri 9am to 6pm</p>
            </div>
          </div>
          <div class="media contact-info">
            <span class="contact-info__icon"><i class="ti-email"></i></span>
            <div class="media-body">
              <h3>support@colorlib.com</h3>
              <p>Send us your query anytime!</p>
            </div>
          </div>
        </div>
      </div>
     </div>
    </section>

					<!--::footer_part start::-->
					<%@ include file="common/footer.jsp"%>
					<!--::footer_part end::-->
					<!-- importare script -->
					<%@ include file="common/script.jsp"%>
</body>
</html>