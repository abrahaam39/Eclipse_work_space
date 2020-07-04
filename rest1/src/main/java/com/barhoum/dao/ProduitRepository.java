package com.barhoum.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.barhoum.entitees.Produit;
@RepositoryRestResource(path="produits")
public interface ProduitRepository extends JpaRepository<Produit,Long>{
   //@RestResource(path="/chercher")
	//public List<Produit> findByDesignation(@Param("mc")String des);
 
}
