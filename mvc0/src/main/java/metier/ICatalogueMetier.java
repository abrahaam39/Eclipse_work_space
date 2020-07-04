package metier;

import java.util.ArrayList;

import java.util.List;

public interface ICatalogueMetier {

	public void addProduit(Produit p);
	public   ArrayList<Produit> listeProduit();
	public   ArrayList<Produit> produitsParMC(String mc);
	
	public Produit getProduit(String ref);
	
	public void updateProduit(Produit p);
	public void deleteProduit(String ref);
}
