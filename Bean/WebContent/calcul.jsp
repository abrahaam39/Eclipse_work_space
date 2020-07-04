<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="web.Modelcalcul"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%  Modelcalcul modele = (Modelcalcul) request.getAttribute("modele"); %>
</head>
<body>
   <form method="post" action="Controler">
     <table>
        <tr> 
          <td><label>taper a : </label></td><td><input name="a" type="number" value="<%=modele.getA()%>"></td>
        </tr>
          <tr> 
          <td><label>taper b : </label></td><td><input name="b" type="number" value="<%=modele.getB()%>"></td>
        </tr>
        <tr> 
          <td><input type="submit" value="valider"><td></td>
        </tr>  
     </table>
   </form>
   <h1>  la somme est :<%=modele.getSomme() %></h1>
   <h1>  la difference est :<%=modele.getSous() %></h1>
   <h1>  le produit est : <%=modele.getProduit()%></h1>
</body>
</html>