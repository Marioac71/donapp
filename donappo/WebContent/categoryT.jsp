<%@page import="java.awt.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page import="java.util.*"%>
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

    <!--================Home Banner Area =================-->
    <!-- breadcrumb start-->
    <section class="breadcrumb breadcrumb_bg">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-lg-8">
                    <div class="breadcrumb_iner">
                        <div class="breadcrumb_iner_item">
                            <h2>Shop Category</h2>
                            <p>Home <span>-</span> Shop Category</p>
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
                                <ul class="list">
                                    <li>
                                        <a href="#">Elettronica</a>
                                      
                                    </li>
                                    <li>
                                        <a href="#">Abbigliamento</a>
                                     
                                    </li>
                                    <li>
                                        <a href="#">Arredamento</a>
                                 
                                    </li>
                                    <li>
                                        <a href="#">Auto e Moto</a>
                              
                                    </li>
                                    <li>
                                        <a href="#">Articoli Sportivi</a>
                                    
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
									<img src="img/product/product_1.png" alt="">
									<div class="single_product_text">
										<form action="GetOgg" id="${item.idOggetto}">


											<input type="hidden" name="idoggetto" value="${item.idOggetto}">
											 <a onclick="document.getElementById('${item.idOggetto}').submit()"> ${item.nome}</a>
											<h3>${item.idProprietario}</h3>
											<a href="#" class="add_cart">+ add to cart<i
												class="ti-heart"></i></a>
									</form>
									</div>
								</div>
							</div>
						</c:forEach>
					</div>
					
					<div class="col-lg-12">
                            <div class="pageination">
                                <nav aria-label="Page navigation example">
                                    <ul class="pagination justify-content-center">
                                        <li class="page-item">
                                            <a class="page-link" href="#" aria-label="Previous">
                                                <i class="ti-angle-double-left"></i>
                                            </a>
                                        </li>
                                        <li class="page-item"><a class="page-link" href="#">1</a></li>
                                        <li class="page-item"><a class="page-link" href="#">2</a></li>
                                        <li class="page-item"><a class="page-link" href="#">3</a></li>
                                        <li class="page-item"><a class="page-link" href="#">4</a></li>
                                        <li class="page-item"><a class="page-link" href="#">5</a></li>
                                        <li class="page-item"><a class="page-link" href="#">6</a></li>
                                        <li class="page-item">
                                            <a class="page-link" href="#" aria-label="Next">
                                                <i class="ti-angle-double-right"></i>
                                            </a>
                                        </li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
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