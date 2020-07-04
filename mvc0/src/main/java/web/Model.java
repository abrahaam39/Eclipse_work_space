package web;


import java.util.ArrayList;
import java.util.List;

import metier.Produit;

public class Model {     
	private String motCle;
	private ArrayList<Produit> produitsParMC = new ArrayList<Produit>();
	private Produit produit = new Produit();
	private String action="";   
	private String saveORediter="save";
	
	public String getSaveORediter() {
		return saveORediter;
	}
	public void setSaveORediter(String saveORediter) {
		this.saveORediter = saveORediter;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public ArrayList<Produit> getProduitsParMC() {
		return produitsParMC;
	}
	public void setProduitsParMC(ArrayList<Produit> produitsParMC) {
		this.produitsParMC = produitsParMC;
	}
 
	
	 
}
