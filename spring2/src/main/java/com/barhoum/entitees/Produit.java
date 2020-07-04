package com.barhoum.entitees;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Produit implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long id;
	@Column(length=70)
	private String designation;
	private double prix;
	private int quantite;
	@ManyToOne
	@JoinColumn(name="ID_CAT")
	
	private Categorie categorie;
	

	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Produit(String designation, double prix, int quantite) {
		super();
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
	}
	public Produit(String designation, double prix, int quantite,Categorie categorie) {
		super();
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Long getId() {
		return id;
	}
	public String getDesignation() {
		return designation;
	}
	public double getPrix() {
		return prix;
	}
	public int getQuantite() {
		return quantite;
	}
}
	