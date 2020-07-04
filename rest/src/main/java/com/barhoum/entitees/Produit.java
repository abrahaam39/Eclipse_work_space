package com.barhoum.entitees;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Produit implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(length=70)
	
	private String designation;
    private long quantite;
	private double prix;
	//@Temporal(TemporalType.DATE)
	//private Date date;
	
	public Produit(String designation, long quantite, double prix) {
		super();
		this.designation = designation;
		this.quantite = quantite;
		this.prix = prix;
		//this.date = date;

     	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public long getQuantite() {
		return quantite;
	}
	public void setQuantité(long quantite) {
		this.quantite = quantite;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

	

}