package com.barhoum;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Produit implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private String designation;
	private double prix;
	private int quantite;
	
	
	public Produit(String designation, double prix, int quantite) {
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
