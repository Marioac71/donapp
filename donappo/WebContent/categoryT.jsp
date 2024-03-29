<%@page import="java.awt.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page import="java.util.*"%>
 <% 
    	Boolean x=(Boolean)session.getAttribute("loggato");
    	System.out.println("x = "+x);
    	if(x==null || !x) {
    		System.out.println(x);
    		 response.sendRedirect("loginT.jsp");
    	}  

     
    %>
<!doctype html>
<html lang="zxx">

<head>
<style type="text/css">
.btn-link {
    border: none;
    outline: none;
    background: none;
    cursor: pointer;
    color: #0000EE;
    padding: 0;
    text-decoration: underline;
    font-family: inherit;
    font-size: inherit;
}
</style>
    <!-- Required meta tags -->
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
                            <h2>Categoria</h2>
                            <p>Home <span>-</span>Categoria</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- breadcrumb start-->

    <!--================Category Product Area =================-->
    <section class="cat_product_area section_padding">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <div class="left_sidebar_area">
                        <aside class="left_widgets p_filter_widgets">
                            <div class="l_w_title">
                                <h3>Categoria Prodotti</h3>
                            </div>
                            <div class="widgets_inner">
                            <form action="servletCategoria" method="GET">
                                <ul class="list">
                                    <li>
                                        <button type="submit" name="categoria" value="1" class="btn-link">Arredamento</button>
                                      
                                    </li>
                                    <li>
                                        <button type="submit" name="categoria" value="2" class="btn-link">Elettronica</button>
                                     
                                    </li>
                                    <li>
                                        <button type="submit" name="categoria" value="3" class="btn-link">Sport</button>
                                 
                                    </li>
                                    <li>
                                        <button type="submit" name="categoria" value="4" class="btn-link">Abbigliamento</button>
                                     </li>  
                                    
                                    <!--  </li>
                                    <li>
                                        <a href="#">Meat Alternatives</a>
                                        <span>(250)</span>
                                    </li>
                                    <li>
                                        <a href="#">Meat</a>
                                        <span>(250)</span>
                                    </li>
                                    -->
                                </ul>
                                </form>
                            </div>
                        </aside>


                    </div>
                </div>
                <div class="col-lg-9">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="product_top_bar d-flex justify-content-between align-items-center">

                            </div>
                        </div>
                    </div>


					<div class="row align-items-center latest_product_inner">
						<c:forEach items="${listaogg}" var="item">



							<div class="col-lg-4 col-sm-6">
								<div class="single_product_item">
									<img src="${item.foto}" alt="">
									<div class="single_product_text">
										<form action="GetOgg" id="${item.idOggetto}">


											<input type="hidden" name="idoggetto" value="${item.idOggetto}">
											 <a onclick="document.getElementById('${item.idOggetto}').submit()"> Visualizza</a>
											<h3>${item.nome}</h3>
											
											
									</form>
									</div>
								</div>
							</div>
						</c:forEach>
					</div>
					
					
                    </div>
                </div>
            </div>
    </section>
    <!--================End Category Product Area =================-->

    <!-- product_list part start-->

    <!-- product_list part end-->

    <!--::footer_part start::-->
    <%@ include file = "common/footer.jsp" %> 
    <!--::footer_part end::-->

    <!-- importo gli script-->
    <%@ include file = "common/script.jsp" %> 
   
</body>

</html>