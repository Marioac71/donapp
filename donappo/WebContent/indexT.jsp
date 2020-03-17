
<!doctype html>

<html lang="zxx">



<head>

    <!-- Required meta tags -->
	<%@ include file = "common/head.jsp" %> 
	
</head>

<body>

    <!--::header part start::-->
   <%@ include file = "common/header.jsp" %> 
    <!-- Header part end-->

    <!-- banner part start-->
    <section class="banner_part">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-lg-12">
                    <div class="banner_slider owl-carousel">
                        <div class="single_banner_slider">
                            <div class="row">
                                <div class="col-lg-5 col-md-8">
                                    <div class="banner_text">
                                        <div class="banner_text_iner">
                                            <h2>Benvenuto in DonApp</h2>
                                            <p>Nasce la prima app di donazione all'interno dell'azienda, 
                                            un'idea semplice con un obiettivo molto ambizioso: 
                                            promuovere e sostenere un'Economia Circolare.
                                            Un progetto partecipativo dove ridare vita agli oggetti che non usiamo più, 
                                            diminuire i consumi di risorse e il nostro impatto sull'ambiente 
                                            oltre che risparmiare anche a livello economico!</p>
                                            <a href="loginT.jsp" class="btn_2">Dona Ora</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="banner_img d-none d-lg-block">
                                    <img src="assets/img/manigiu.jpeg" height="300px" width="300px" style="margin-right: 100px">
                                </div>
                            </div>
                        </div><div class="single_banner_slider">
                            <div class="row">
                                <div class="col-lg-5 col-md-8">
                                    <div class="banner_text">
                                        <div class="banner_text_iner">
                                            <h2>Come funziona?</h2>
                                            <p>Ridiamo valore a ciò che non utilizziamo più!
                                            <b>Inserisci</b> elementi d'arredo, capi d'abbigliamento, 
                                            oggetti di elettronica e tutto quello che non usi più, 
                                            per acquisti sbagliati o semplicemente perchè ti hanno annoiato, 
                                            ma che potrebbero invece essere utili o graditi ad altre persone.<br>
                                            <b>Prenota</b> e <b>Ritira</b> gli oggetti che desideri.</p>
                                            <a href="loginT.jsp" class="btn_2">Dona Ora</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="banner_img d-none d-lg-block">
                                    <img src="assets/img/rius.jpeg" height="350px" width="550px" style="margin-right: 100px" >
                                </div>
                            </div>
                        </div><!--<div class="single_banner_slider">
                            <div class="row">
                                <div class="col-lg-5 col-md-8">
                                    <div class="banner_text">
                                        <div class="banner_text_iner">
                                            <h1>Wood & Cloth
                                                Sofa3</h1>
                                            <p>Incididunt ut labore et dolore magna aliqua quis ipsum
                                                suspendisse ultrices gravida. Risus commodo viverra</p>
                                            <a href="#" class="btn_2">buy now</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="banner_img d-none d-lg-block">
                                    <img src="img/banner_img.png" alt="">
                                </div>
                            </div>
                        </div> -->
                        <!-- <div class="single_banner_slider">
                            <div class="row">
                                <div class="col-lg-5 col-md-8">
                                    <div class="banner_text">
                                        <div class="banner_text_iner">
                                            <h1>Cloth $ Wood Sofa</h1>
                                            <p>Incididunt ut labore et dolore magna aliqua quis ipsum
                                                suspendisse ultrices gravida. Risus commodo viverra</p>
                                            <a href="#" class="btn_2">buy now</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="banner_img d-none d-lg-block">
                                    <img src="img/banner_img.png" alt="">
                                </div>
                            </div>
                        </div> -->
                    </div>
                    
                </div>
            </div>
        </div>
    </section>
    <!-- banner part start-->

    <!-- feature_part start-->
    <section class="feature_part padding_top">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-lg-8">
                    <div class="section_tittle text-center">
                        <h2>Categorie</h2>
                    </div>
                </div>
            </div>
            <form action="servletCategoria" method="get">
            <div class="row align-items-center justify-content-between">
                <div class="col-lg-7 col-sm-6">
                    <div class="single_feature_post_text" style="background-image: url(assets/img/catvest.jpg);background-size: 682px 310px; background-repeat: no-repeat; background-position: 0% 100% ">
                    <p>Cat.Abbigliamento</p>
                        <h2>Abbigliamento</h2>
                        <button type="submit" name="categoria" value="4" class="feature_btn">VISITA ORA<i class="fas fa-play"></i></button> 
                    </div>
                </div>
                <div class="col-lg-5 col-sm-6">
                    <div class="single_feature_post_text" style="background-image: url(assets/img/catele.jpg); background-size: 487px 310px; background-repeat: no-repeat; background-position: 0% 100%">
                   <p>Cat.Elettronica</p>
                        <h2>Elettronica</h2>
                         <button type="submit" name="categoria" value="2" class="feature_btn">VISITA ORA<i class="fas fa-play"></i></button>
                        <img src="img/feature/feature_2.png" alt="">
                    </div>
                </div>
                <div class="col-lg-5 col-sm-6">
                    <div class="single_feature_post_text" style="background-image: url(assets/img/catsport.jpg); background-size: 487px 310px; background-repeat: no-repeat; background-position: 0% 100%">
                        <p>Cat.Sport</p>
                        <h2>Articoli sportivi</h2>
                        <button type="submit" name="categoria" value="3" class="feature_btn">VISITA ORA<i class="fas fa-play"></i></button>
                        <img src="img/feature/feature_3.png" alt="">
                    </div>
                </div>
                <div class="col-lg-7 col-sm-6">
                    <div class="single_feature_post_text" style="background-image: url(assets/img/catarr.jpg); background-size: 652px 300px; background-repeat: no-repeat; background-position: 0% 100%">
                        <p>Cat.Arredamento</p>
                        <h2>Per la casa</h2>
                       <button type="submit" name="categoria" value="1" class="feature_btn">VISITA ORA<i class="fas fa-play"></i></button>
                        <img src="img/feature/feature_4.png" alt="">
                    </div>
                </div>
            </div>
          </form>
        </div>
    </section>
    <!-- upcoming_event part start-->

    <!-- product_list start-->
    
    <!-- product_list part start-->

    <!-- awesome_shop start-->

    <!-- awesome_shop part start-->

    <!-- product_list part start-->
    
    <!-- product_list part end-->

    <!-- subscribe_area part start-->
  
    <!--::subscribe_area part end::-->


    <!--::footer_part start::-->
   	<%@ include file="common/footer.jsp" %>
    <!--::footer_part end::-->

	<!-- importare script -->
	<%@ include file = "common/script.jsp" %> 
	
</body>

</html>