package com.barhoum.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.barhoum.entitees.Produit;
   @Transactional
   @Repository
public class Produitdaoimpl implements EntityRepository<Produit>{
	
    @PersistenceContext
    private EntityManager em;

	@Override
	public Produit save(Produit p) {
		em.persist(p);
		return p;
	}

	

	@Override
	public List<Produit> findbyDesignation(String mc) {
		Query req = em.createQuery("select p from Produit p where p.designation like : x");
		req.setParameter("x", mc);
		return req.getResultList();
		
	}

	@Override
	public void remove(Long id) {
		Produit p = em.find(Produit.class,id);
		em.remove(p);
	}

	@Override
	public void update(Produit p) {
		em.merge(p);
		
	}



	@Override
	public List<Produit> findAll() {
		Query req = em.createQuery("select p from Produit p ");
	
		return req.getResultList();
	
	}



	@Override
	public Produit findone(Long id) {
		Produit p = em.find(Produit.class,id);
		return p;
	}



	


	
}