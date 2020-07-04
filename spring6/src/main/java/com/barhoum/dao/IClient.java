package com.barhoum.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.barhoum.entitees.Utilisateur;

public interface IClient extends JpaRepository<Utilisateur,Long>{
	@Query("select u from Utilisateur u where u.login like :x")
	public List<Utilisateur> findbylogin(
			@Param("x")String login);
  
}
