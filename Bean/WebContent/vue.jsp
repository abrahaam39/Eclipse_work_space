<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="web.Produit" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

  <%   Produit modele = (Produit) request.getAttribute("modele"); %>
</head>
<body>
     <form method="post" action="Controleur"> 
      <table>
          <tr>
            <td><label>taper votre age</label></td><td><input name="nom" type="text" value="<%=modele.getNom() %>" required="required"></td>
          </tr>  
           <tr>
             <td><label>taper votre prenom</label></td><td><input name="prenom" type="text" required="required"></td>
          </tr>   
           <tr>
             <td><label>taper votre poids</label></td><td><input name="prix" type="number" required="required"></td>
          </tr>  
          <tr>
             <td><label> votre poids double</label></td><td><input name="prix2" value="<%=modele.getPrix2()%>"></td>
          </tr>  
          
          <tr><td><input type="submit" value="valider"></td><></tr> 
        </table>
     
     </form>
     
         <h1> nom :<%=modele.getNom()%></h1>
         <h1> prenom :<%=modele.getPrenom()%></h1>
         <h1> prix :<%=modele.getPrix()%></h1>
         <h1> prix2 :<%=modele.getPrix2()%></h1>
 </body>
</html>