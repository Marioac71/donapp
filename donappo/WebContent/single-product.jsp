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
  <section class="breadcrumb breadcrumb_bg">
    <div class="container">
      <div class="row justify-content-center">
        <div class="col-lg-8">
          <div class="breadcrumb_iner">
            <div class="breadcrumb_iner_item">
              <h2>Shop Single</h2>
              <p>Home <span>-</span> Shop Single</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- breadcrumb start-->
  <!--================End Home Banner Area =================-->

  <!--================Single Product Area =================-->
  <div class="product_image_area section_padding">
    <div class="container">
      <div class="row s_product_inner justify-content-between">
        <div class="col-lg-7 col-xl-7">
          <div class="product_slider_img">
            <div id="vertical">
             <div data-thumb="img/product/single-product/product_1.png" class="lslide active" style="height: 450px; margin-bottom: 0px;">
                <img src="https://wallpaperplay.com/walls/full/4/9/e/48868.jpg">
                </div>
            </div>
          </div>
        </div>
        <div class="col-lg-5 col-xl-4">
          <div class="s_product_text">
            <h5>previous <span>|</span> next</h5>
            <h3>Faded SkyBlu Denim Jeans</h3>
            <ul class="list">
              <li>
                <a class="active" href="#">
                  <span>Category</span> quale categoria?</a>
              </li>
              <li>
                <a href="#"> <span>disponibilit�</span> : In Stock</a>
              </li>
            </ul>
            <p>
              Inserisci qui la tua descrizione articolo
            </p>
            <div class="card_area d-flex justify-content-between align-items-center">
              <div class="product_count">
                <span class="inumber-decrement"> <i class="ti-minus"></i></span>
                <input class="input-number" type="text" value="1" min="0" max="10">
                <span class="number-increment"> <i class="ti-plus"></i></span>
              </div>
              <a href="#" class="btn_3">Prenota Ora</a>
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