package web;

public class Produit {
	private String nom;
	private String prenom;
	private int prix;
	private int prix2;
	
	public Produit(int prix2) {
		super();
		this.prix2 = prix2;
	}
	public int getPrix2() {
		return prix2;
	}
	public void setPrix2(int prix2) {
		this.prix2 = prix2;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String nom, String prenom, int prix, int prix2) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.prix = prix;
		this.prix2 = prix2;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setPrix(int prix) {
		
		this.prix = prix;
		}
	
	
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getPrix() {
		return prix;
	}

}
