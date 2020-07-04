package com.barhoum.dao;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.barhoum.entitees.Produit;

public interface Produitrepository extends JpaRepository<Produit,Long>{
//@Query("select p from Produit where p.designation like: x")
//public Page<Produit> chercher(@Param("x") String mc,Pageable pageable);
}

