<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"
    import="web.CreditModel"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Credit simulateur</title>
<link rel="stylesheet" href="bootstrap.min.css">
  <%  CreditModel modele = (CreditModel) request.getAttribute("modele") ;
      %>
</head>
<body>
        <div class="container">
          <div class="pannel">
            <div class="pannel-heading bg-primary">Simulateur de credit</div>
              <div class="pannel-body">
               <form method="post" action="Controler">
               <table class="table">
                 <tr><td>Montant</td><td><input type="number" name="montant" class="form-control" value="<%=modele.getMontant()%>" required="required"></td></tr>
                 <tr><td>Taux</td><td><input type="text" name="taux" class="form-control" value="<%=modele.getTaux()%>"></td></tr>
                 <tr><td>Duree</td><td><input type="text" name="duree" class="form-control" value="<%=modele.getDuree()%>"></td></tr>
                 <tr><td>Mensualite</td><td><input type="text" class="form-control"  value="<%=modele.getMensualite()%>"></td></tr>
                 <tr><td><button type="submit" class="btn btn-primary">calculer</button><td></tr>
          </table>
          </form>
          </div>
          </div>
         </div> 
    
</body>
</html>