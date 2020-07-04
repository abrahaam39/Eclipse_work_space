package com.barhoum.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barhoum.entitees.Categorie;

public interface CategoryRepository extends JpaRepository<Categorie,Long>{

}
