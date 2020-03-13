<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
              <h2>Prodotti in prenotazione</h2>
              <p>Home <span>-</span>Prodotti in prenotazione</p>
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
              <tr>
                <th scope="col">Prodotti</th>
                <th scope="col">Prenota</th>
              </tr>
            </thead>
            <tbody>
            <c:forEach items="${myogg}" var="item">
              <tr>
                <td>
                  <div class="media">
                    <div class="d-flex">
                      <img src="https://198530-593833-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2020/03/consigli-fotografia-inverno.jpg" />
                    </div>
                    <div class="media-body">
                      <p>${item.nome}</p>
                    </div>
                  </div>
                  
                </td>
                <td> 
                mkkml,l             
                </td>
              </tr>
            </c:forEach>  
            </tbody>
            
          </table>
          <div class="checkout_btn_inner float-right">
            <a class="btn_1" href="#">Continua Shopping</a>
            <a class="btn_1 checkout_btn_1" href="#">Procedi al checkout</a>
          </div>
        </div>
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