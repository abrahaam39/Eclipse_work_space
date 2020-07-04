package metier;

import java.sql.Connection;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CatalogueMetierImpl implements ICatalogueMetier{

	public void addProduit(Produit p)  {   //NB:  execute Update et non pas executeQuery
		Connection connec = SingletonConnection.getConnection();
		//le block try catch est obligatoire pour executer une requette
		try {
			
			java.sql.PreparedStatement pr = connec.prepareStatement("INSERT INTO  prod (REF_PROD,DESIGNATION,PRIX,QUANTITE)  values (?,?,?,?) ");
			
			pr.setString(1, p.getReference());
			pr.setString(2, p.getDesignation());
			pr.setInt(3, p.getPrix());
			pr.setInt(4, p.getQuantite()); 
			
			pr.executeUpdate();  //NB : pour l'ajout (insertion dans la base de donnee), on fait execute Update et non pas executeQuery
			 
			pr.close();   //il faut toujour fermer la connection
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public ArrayList<Produit> listeProduit() {

		ArrayList<Produit> prods=new ArrayList<Produit>(); //cree une instance de la liste des produits
		
		
		//le block try catch est obligatoire pour une requette
				try {
					
					java.sql.PreparedStatement pr = SingletonConnection.getConnection().prepareStatement("SELECT * FROM  prod");
					 
					ResultSet rs = pr.executeQuery();
					
					while (rs.next()) {
						//1 : il faut instancier un produit (qui correspond a la table produit) --> puis faire les setter de ces attributs 
						Produit p=new Produit();
						//2 : donner les valeurs aux attributs du produit instancier
						p.setReference(rs.getString("REF_PROD"));
						p.setDesignation(rs.getString("DESIGNATION"));
						p.setPrix(rs.getInt("PRIX"));
						p.setQuantite(rs.getInt("QUANTITE"));
						//3 : ajouter le produit a la liste des produits
						prods.add(p); 
						
					}
					
					pr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		return prods;
	}

	public ArrayList<Produit> produitsParMC(String mc) {
		ArrayList<Produit> prodsParMC=new ArrayList<Produit>(); //cree une instance de la liste des produits
		
		
		//le block try catch est obligatoire pour une requette
				try {
					
					java.sql.PreparedStatement pr = SingletonConnection.getConnection().prepareStatement("SELECT * FROM  prod WHERE DESIGNATION like ?");
					 
					pr.setString(1 , "%"+mc+"%"); // on a une seule '?'
					
					ResultSet rs = pr.executeQuery();
					
					while (rs.next()) {
						//1 : il faut instancier un produit (qui correspond a la table produit) --> puis faire les setter de ces attributs 
						Produit p=new Produit();
						//2 : donner les valeurs aux attributs du produit instancier
						p.setReference(rs.getString("REF_PROD"));
						p.setDesignation(rs.getString("DESIGNATION"));
						p.setPrix(rs.getInt("PRIX"));
						p.setQuantite(rs.getInt("QUANTITE"));
						//3 : ajouter le produit a la liste des produits
						prodsParMC.add(p); 
						
					}
					
					pr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		return prodsParMC;
	}

	public Produit getProduit(String ref) {
		Produit produit=new Produit();
		
		
		//le block try catch est obligatoire pour une requette
				try {
					
					java.sql.PreparedStatement pr = SingletonConnection.getConnection().prepareStatement("SELECT * FROM  prod WHERE REF_PROD = ?");
					 
					pr.setString(1 ,ref); // on a une seule '?'
					
					ResultSet rs = pr.executeQuery();  //on aura un produit ou aucun produit trouver
					
					if (rs.next()) {
						 
						// donner les valeurs aux attributs du produit instancier
						produit.setReference(rs.getString("REF_PROD"));
						produit.setDesignation(rs.getString("DESIGNATION"));
						produit.setPrix(rs.getInt("PRIX"));
						produit.setQuantite(rs.getInt("QUANTITE"));
						  
					}
					
					pr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		return produit;
	}

	public void updateProduit(Produit p) { 
		
		//le block try catch est obligatoire pour une requette
				try {
					
					java.sql.PreparedStatement pr = SingletonConnection.getConnection().prepareStatement("UPDATE prod set DESIGNATION = ? , PRIX= ? , QUANTITE= ? where REF_PROD=?");
					  
					pr.setString(1, p.getDesignation());
					pr.setInt(2, p.getPrix());
					pr.setInt(3, p.getQuantite());
					pr.setString(4, p.getReference());
					
					pr.executeUpdate();  // pour la requette update , on fait executeUpdate et non pas executeQuery
					
					 pr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}

	public void deleteProduit(String ref) {  //NB:  execute Update et non pas executeQuery
		//le block try catch est obligatoire pour une requette
		try {
			
			java.sql.PreparedStatement pr = SingletonConnection.getConnection().prepareStatement("DELETE FROM prod WHERE REF_PROD= ?");
			  
			pr.setString(1,ref); 
			
			pr.executeUpdate();  //NB:  execute Update et non pas executeQuery 
			
			pr.close(); // fermeture de PreparedStatement
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

	 

}
