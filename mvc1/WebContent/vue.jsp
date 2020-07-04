<%@page import="java.util.Iterator"%>
<%@page import="metier.Produit"%>
<%@page import="java.util.List"%>
<%@page import="web.Model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<%

Model model=new Model();

if(request.getAttribute("model") != null){
	 model=(Model)request.getAttribute("model");
}


%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vue Produits</title>


	<script type="text/javascript">
		function confirmer(url){   <!-- ce  url doit etre entre deux simple cot   '' : si non ça ne va pas marcher-->
			
			var rep=confirm("Etes vous sur de vouloir supprimer ?");
			if(rep==true){
				document.location=url;
			}
			
		}
	</script>


</head> 
<body>
 
<div>
		<form action="ControleurServlet" method="post"> 
				<table>
					<tr> 
						<td>Mot Clé:  </td>
						<td> <input type="text" name="motCle" value="<%= model.getMotCle() %>"/></td>
						<td><input type="submit" name="action" value="chercher" /> </td>
					</tr>
				</table>
		</form>
</div>

<div>
		<form action="ControleurServlet" method="post"> 
		<input type="hidden" name="saveORediter" value="<%= model.getSaveORediter() %>"/>
				<table>
					<tr> 
						<td>REf:  </td>
						<% if( model.getSaveORediter().equals("editer")) {  %>
							<td>  <%= model.getProduit().getReference()%> <input type="hidden" name="referenceProduitToEdit" value="<%= model.getProduit().getReference()%>"/></td>
						<%  } else { %>
							<td> <input type="text" name="reference"  value="<%= model.getProduit().getReference()%>" /></td>	
						
						<% } %> 
					 </tr>
					<tr> 
						<td>Designation:  </td>
						<td> <input type="text" name="designation"  value="<%= model.getProduit().getDesignation() %>"/></td>
					</tr>
					<tr> 
						<td>Prix:  </td>
						<td> <input type="text" name="prix"  value="<%= model.getProduit().getPrix() %>" /></td>
					</tr>
					<tr> 
						<td>Quantite:  </td>
						<td> <input type="text" name="quantite" value="<%= model.getProduit().getQuantite() %>" /></td>
					</tr>
					
					
					
					<tr>  
						<td> <input type="submit" name="action" value="save"/></td>
					</tr>
					
				</table>
		</form>
</div>


<div>
		<table class="table1">
			<tr>
					<th>REF </th><th>DES </th><th> PRIX</th><th> QUANTITE</th>
			 </tr>
			 
			 <% 
			    Iterator<Produit>  prods=model.getProduitsParMC().iterator();
				while( prods.hasNext()) {
				 	Produit p= prods.next(); 
			 %>
			 
			 <tr> 
					 <td><%= p.getReference() %> </td>
					 <td><%= p.getDesignation() %>  </td>
					 <td> <%= p.getPrix() %> </td>
					 <td><%= p.getQuantite() %>  </td>
					 <td> <a href="javascript:confirmer('controleur.php?action=delete&ref=<%=p.getReference()%>')"> supprimer </a> </td>
					 <td> <a href="controleur.php?action=editer&ref=<%=p.getReference()%>"> editer </a> </td>
			 </tr>
		 <% } %>
		</table>

</div>






</body>
</html>