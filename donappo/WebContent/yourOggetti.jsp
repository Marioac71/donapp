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
    <div class="container" >
      <div class="row justify-content-center">
        <div class="col-lg-8">
          <div class="breadcrumb_iner">
            <div class="breadcrumb_iner_item">
              <h2>I tuoi oggetti</h2>
              <p>Home <span>-</span>I tuoi Oggetti</p>
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
      	<%
      		String s = (String)session.getAttribute("typemessage");
      		if(s!=null && !s.equals(""))
      		{
      			%>
      			<div class="alert alert-<%=s %>"><%=(String)session.getAttribute("message")%></div>      			
      			<%
      			session.removeAttribute("typemessage");
      			session.removeAttribute("message");
      		}
      	%>
        <div class="table-responsive">
        <form action="servletEliminaOgg" method="get" >
          <table class="table" >
          <tbody>
              <tr>
               <th>Foto</th>
               <th>Id Oggetto</th>
               <th>Disponibilità</th>
               <th>Luogo ritiro</th>
               <th>Id Prenotante</th>
			   <th>Elimina Oggetto</th>              
			 </tr>
			 
              <c:forEach items="${myogg}" var="item">
             
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
                <td> <p>${item.disponibilita}</p></td>
                <td> <p>${item.luogoRitiro}</p></td>
                <td> <p>${item.idPrenotante}</p></td>
                
                <td> <input type="hidden" name="idoggetto" value="${item.idOggetto}">
                <input type="submit" class="btn_3" value="Elimina"></td>
             
              </tr>
               
              </c:forEach> 
             
            </tbody>
          </table>
           </form>
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