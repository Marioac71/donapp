<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    <% 
    try{
    	boolean x=(boolean)session.getAttribute("loggato");
    	System.out.println("x = "+x);
    	if(x) {
    		System.out.println(x);
    		%>
    		<jsp:forward page="indexT.jsp"/>
   		<% }
    	else {
    		%>
<script type="text/javascript">
alert ("Username o Password errati");
</script>
    	<% }
    	 %>
    		
    <% 

    }
    catch(Exception e){
    	e.printStackTrace();
    session.setAttribute("loggato",false);
    } 
    %>
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
    <section class="login_part padding_top">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-lg-6 col-md-6">
                    <div class="login_part_text text-center">
                        <div class="login_part_text_iner">
                            <h2>Nuovo Visitatore?</h2>
                            <p>Ci sono tantissimi prodotti in donazione che
                            aspettano solo te</p>
                            <a href="#" class="btn_3">Crea un Account</a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6">
                 
                    <div class="login_part_form">
                    
                        <div class="login_part_form_iner">
                        <Center><img src="assets/img/LogoDonApp.png" alt="logo" height="84px" width="244px"></Center>
                            <Center><h3>Bentornato<br>
                                Accedi con i tuoi dati</h3></Center>
                            <form class="row contact_form" action="Login" method="post" novalidate="novalidate">
                                <div class="col-md-12 form-group p_star">
                                    <input type="text" class="form-control" id="name" name="username" value=""
                                        placeholder="Username">
                                </div>
                                <div class="col-md-12 form-group p_star">
                                    <input type="password" class="form-control" id="password" name="password" value=""
                                        placeholder="Password">
                                </div>
                                <div class="col-md-12 form-group">
                                    <div class="creat_account d-flex align-items-center">
                                        <input type="checkbox" id="f-option" name="selector">
                                        <label for="f-option">Ricordami</label>
                                    </div>
                                    <button type="submit" value="submit" class="btn_3">
                                        login
                                    </button>
                                    <a class="lost_pass" href="#">Password dimenticata?</a>
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
	<%@ include file = "common/footer.jsp" %>
    <!--::footer_part end::-->

	<!-- importare script -->
	<%@ include file = "common/script.jsp" %> 
</body>

</html>