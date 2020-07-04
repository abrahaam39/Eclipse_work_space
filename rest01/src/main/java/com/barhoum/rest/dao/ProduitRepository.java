package com.barhoum.rest.dao;

import com.barhoum.rest.entitees.Produit111;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProduitRepository extends JpaRepository <Produit111,Long>{
}
