package com.barhoum.dao;

import org.springframework.data.domain.Pageable;

import java.util.List;

import org.springframework.data.domain.Page;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.barhoum.entitees.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long>{

	
  
	public Page<Produit> findByDesignationContains(String mc, Pageable pageable);


	


}
