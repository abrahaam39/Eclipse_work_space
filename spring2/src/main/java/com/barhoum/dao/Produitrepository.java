package com.barhoum.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.barhoum.entitees.Produit;

public interface Produitrepository extends JpaRepository<Produit,Long>{
    @Query("select p from Produit p where p.designation like :x")
	public List<Produit> produitmc(@Param("x")String mc);
    public List<Produit> findByDesignationContain(String motcle);

}
