package com.barhoum.entitees;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Categorie implements Serializable{

	
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nomcategorie;
	@OneToMany(mappedBy="categorie",fetch=FetchType.LAZY)
	private Collection<Produit> produits;

	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNomcategorie(String nomcategorie) {
		this.nomcategorie = nomcategorie;
	}
	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	public Categorie(String nomcategorie) {
		super();
		this.nomcategorie = nomcategorie;
	}
	public Long getId() {
		return id;
	}
	public String getNomcategorie() {
		return nomcategorie;
	}
	public Collection<Produit> getProduits() {
		return produits;
	}

}
