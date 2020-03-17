<!doctype html>
<html lang="zxx">
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
  <%@ include file = "common/head.jsp" %>
  <link rel="stylesheet" href="css/nice-select.css">
  <link rel="stylesheet" href="css/price_rangs.css">
</head>

<body>
  <!--::header part start::-->
  <%@ include file = "common/header.jsp" %>
  <!-- Header part end-->


  <!--================Home Banner Area =================-->
  <!-- breadcrumb start-->
<section class="breadcrumb breadcrumb_bg">
    <div class="container" >
      <div class="row justify-content-center">
        <div class="col-lg-8">
          <div class="breadcrumb_iner">
            <div class="breadcrumb_iner_item">
              <h2>Lista delle tue prenotazioni!</h2>
              <p>Home <span>-</span>Prenotazioni</p>
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
          <table class="table" >
          <tbody>
              <tr>
               <th >Foto Prodotto</th>
               <th >ID Prodotto</th>
               <th >Nome Prodotto</th>
               <th >ID Proprietario</th>
               <th >ID Prenotante</th>
               <th >Elimina Prenotazione</th>
              </tr>
              <c:forEach items="${mypren}" var="item">
              <tr>
                <td>
                  <div class="media">
                    <div class="d-flex">
                      <img height="100" width="120" src="${item.foto}" alt="" />
                    </div>
                    <div class="media-body">
                    </div>
                  </div>
                </td>
                <td> <p>${item.idOggetto}</p></td>
                <td> <p>${item.nome}</p></td>
                <td> <p>${item.idProprietario}</p></td>
                <td> <p>${item.idPrenotante}</p></td>
                <td> <p></p> <a href="" class="btn_3">Elimina</a>      </td>
              </tr>
              </c:forEach> 
            </tbody>
          </table>
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
    <script src="js/stellar.js"></script>
  <script src="js/price_rangs.js"></script>
</body>

</html>