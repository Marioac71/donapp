<!doctype html>
<html lang="zxx">

<head>
    <!-- Required meta tags -->
	<%@ include file = "common/head.jsp" %> 
</head>

<body>
    <!--::header part start::-->
    
    <!-- Header part end-->
    <!-- breadcrumb start-->
    <!-- breadcrumb start-->
    <!--================login_part Area =================-->
    <section style="margin-top: -200px; margin-left: 425px" class="login_part padding_top">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-lg-8 col-md-8">
                 
                    <div class="login_part_form">
                    
                        <div class="login_part_form_iner">
                        <Center><img src="assets/img/LogoDonApp.png" alt="logo" height="84px" width="244px"></Center>
                            <Center><h3>Registrazione Utente</h3></Center>
                            <form class="row contact_form" action="Registrazione" method="post" novalidate="novalidate">
                                <div class="col-md-12 form-group p_star">
                                    <input type="text" class="form-control" id="nome" name="nome" value=""
                                        placeholder="Nome">
                                </div>
                                <div class="col-md-12 form-group p_star">
                                    <input type="text" class="form-control" id="cognome" name="cognome" value=""
                                        placeholder="Cognome">
                                </div>
                                <div class="col-md-12 form-group p_star">
                                    <input type="text" class="form-control" id="username" name="username" value=""
                                        placeholder="Username">
                                </div>
                                
                                <div class="col-md-12 form-group p_star">
                                    <input type="password" class="form-control" id="password" name="password" value=""
                                        placeholder="Password">
                                </div>
                                 <div class="col-md-12 form-group p_star">
                                    <input type="email" class="form-control" id="email" name="email" value=""
                                        placeholder="Email">
                                </div>
                                <div class="col-md-12 form-group">
                                    <button type="submit" value="submit" class="btn_3">
                                        Registrati
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--================login_part end =================-->

    <!--::footer_part start::-->
	    <footer style="margin-top: -200px" class="footer_part">
        <div class="copyright_part">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8" style="margin-left: 400px">
                    	<img src="accenture-technologyLogo.png">
                       	 <div class="copyright_text" style="margin-left: 50px; margin-bottom: 50px">    
                            <P><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | <a href="https://www.accenture.com/it-it" target="_blank">Accenture</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></P>
                        </div>
                        
                    </div>
                    <div class="col-lg-4">
                     
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!--::footer_part end::-->

	<!-- importare script -->
	<%@ include file = "common/script.jsp" %> 
</body>

</html>