package metier;

import java.util.List;

public class TestMetier {   //NB: le role de cette classe est de tester le metier --> donc le 1 ere etape est d'instancier le metier
 
	public static void main(String[] args) {  // NB: tester les 5 methodes qui existe dans l'interface "ICatalogueMetier"  et qui  sont redefini dans la classe "CatalogueMetierImpl" qui implemente cette interface
			 
		 //1 ere etape : instancier le metier
		/*  ICatalogueMetier  metier = new CatalogueMetierImpl(); //noter bien cette instance (polymorphisme)
	
		Produit p1 =new Produit(); 
		
		p1.setReference("REF2");
		p1.setDesignation("DESignation2");
		p1.setPrix(500);
		p1.setQuantite(12);
		 
		
		Produit p11 =new Produit(); 
		p11.setReference("REF4");
		p11.setDesignation("fff");
		p11.setPrix(500);
		p11.setQuantite(12);
		
		
		
Produit p2 =new Produit(); 
		 
p2.setDesignation("DES2");
		p2.setPrix(600);
		p2.setQuantite(16);
		
		
	 	metier.addProduit(p1);  
	 	metier.addProduit(p11); */
	//	metier.deleteProduit(p1.getReference());
		
	 	
	 	/*	metier.updateProduit(p2); 
		
		Produit p3= metier.getProduit("REF1");
	 System.out.println(""+p3.getReference()+"" + p3.getDesignation()+"");
	 */
	 
	 
	 ICatalogueMetier  metier = new CatalogueMetierImpl(); //noter bien cette instance (polymorphisme)
		
	 
	List<Produit> prods=metier.listeProduit();
	
	for( Produit p:prods) {
		
		 System.out.println("\n REF:"+p.getReference()+"\n designation :" + p.getDesignation()+"");
			
		
	}
	
	
	}

}
