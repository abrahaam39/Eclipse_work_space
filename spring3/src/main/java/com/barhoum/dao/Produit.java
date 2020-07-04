package com.barhoum.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Produit implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(length=70)
	private String designation;
	@Column
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
	