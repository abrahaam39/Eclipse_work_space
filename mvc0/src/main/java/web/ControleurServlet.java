package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.CatalogueMetierImpl;
import metier.ICatalogueMetier;
import metier.Produit;

public class ControleurServlet extends HttpServlet{
  
	private ICatalogueMetier metier;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		metier = new CatalogueMetierImpl();
	}
	
	 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   // req.setAttribute( "model", new Model() ); // instance du constructeur par defaut  du  " model " qui stocke le contenu de la page web ("donnees saisie et resultat a afficher") et non pas : le model ne correspond pas a une table dans la base de donnee
		//req.getRequestDispatcher("VueProduits.jsp").forward(req,resp); 
	 
		//ces 2 lognes seront remplacer par ceci :  (ceci resout le probleme pour l action delete)
		doPost(req, resp);
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//1 ere etape : toujours instancier le model dans lequel on va stocker les donnees saisies et les resultats a afficher
		Model model=new Model(); 
		
		String action=req.getParameter("action");
		model.setAction(action);
		
		if( action !="") { 
		
		     if( model.getAction().equals("save")  && req.getParameter("saveORediter").equals("save")) { 
		    	 
					//2* :recuperer les donnees saisies    --> Objectif :save un produit
					String reference=req.getParameter("reference");
					String designation= req.getParameter("designation");
					int prix= Integer.parseInt(req.getParameter("prix"));
					int quantite=Integer.parseInt(req.getParameter("quantite"));
					
					
					//3* : stocker les donnees saisies (ici le  motCle) dans le model
					Produit produit=new Produit(reference,designation,prix,quantite);
					model.setProduit(produit);
					
					//4* : invoquer la methode metier desirer pour le resultat voulu  (ici : save un produit)
					metier.addProduit(produit);
					
					//5 &&: rafrechir la vue en appelant a nouveau la liste des produits  
					 
					ArrayList<Produit> allProduits=metier.listeProduit();   
					model.setProduitsParMC(allProduits);
					
			}else if(model.getAction().equals("save")  && req.getParameter("saveORediter").equals("editer")) {
				 
						//2* :recuperer les donnees saisies    --> Objectif :save un produit
					  
					    Produit produitToEdit =	metier.getProduit( req.getParameter("referenceProduitToEdit") ); //cette reference est stocher dans le champs <input type="hidden" ... ajouter  et cacher pour pouvoir recuperer la valeur de frequence
					    
					    produitToEdit.setDesignation(req.getParameter("designation"));
					    produitToEdit.setPrix(Integer.parseInt(req.getParameter("prix")));
					    produitToEdit.setQuantite(Integer.parseInt(req.getParameter("quantite")));
					      
						model.setProduit( produitToEdit); 
						
						//4* : invoquer la methode metier desirer pour le resultat voulu  (ici : save un produit)
						 metier.updateProduit(produitToEdit);  
						
						 model.setProduit(new Produit());  //pour afficher dans les champs du formulaire d ajout des valeurs null
						//5 &&: rafrechir la vue en appelant a nouveau la liste des produits  
						 
						ArrayList<Produit> allProduits=metier.listeProduit();   
						model.setProduitsParMC(allProduits);
						
			}else if( model.getAction().equals("delete") ) {  
				
					//4** : invoquer la methode metier desirer pour le resultat voulu  (ici : supprimer un produit )
					
					metier.deleteProduit(req.getParameter("ref"));
					
					//5 &&: rafrechir la vue en appelant a nouveau la liste des produits  
					 
					ArrayList<Produit> allProduits=metier.listeProduit();   
					model.setProduitsParMC(allProduits);
					
			} else  if ( model.getAction().equals("chercher")) {   //l action est obligatoirement --> chercher :dans le cas ou le mot cle est la chaine vide (string="")
				
				
				//2 : recuperer les donnees saisies    --> Objectif : chercher les produits par mot cle
				String mc=req.getParameter("motCle");
				
				//3: stocker les donnees saisies (ici le  motCle) dans le model
				model.setMotCle(mc);  
				//4 : invoquer la methode metier desirer pour le resultat voulu  (ici : afficher les produits par le mot cle saisie)
				ArrayList<Produit> produitsParMC =metier.produitsParMC(mc);
				
				//5 : stocker le resultat dans le model (pour l afficher  par la suite)
				model.setProduitsParMC(produitsParMC);
				
				
			
				
			} else if( model.getAction().equals("editer") ) { 
				 
				 
				 model.setSaveORediter("editer");
				 
				 
				 Produit produitToEdit =	metier.getProduit( req.getParameter("ref") ); 
				 model.setProduit(produitToEdit);
				 
			 
				 
					//5 &&: rafrechir la vue en appelant a nouveau la liste des produits  
				 
					ArrayList<Produit> allProduits=metier.listeProduit();   
					model.setProduitsParMC(allProduits);

		    }
		}
		
		
		 req.setAttribute( "model", model );  
		 req.getRequestDispatcher("VueProduits.jsp").forward(req,resp); //redirection a la page jsp
	}
	
	
	
	
}
