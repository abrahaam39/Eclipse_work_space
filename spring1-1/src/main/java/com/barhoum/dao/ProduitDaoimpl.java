package com.barhoum.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;


import org.springframework.stereotype.Repository;

import com.barhoum.entitees.Produit;
@Repository
@Transactional
public class ProduitDaoimpl implements EntityRepository<Produit>{
    @PersistenceContext
    private EntityManager em;
	@Override
	public Produit save(Produit p) {
		em.persist(p);
		return p;
	}

	@Override
	public List<Produit> findall() {
		Query req = em.createQuery("select p from Produit p");
		return req.getResultList();
	}

	@Override
	public List<Produit> findmc(String mc) {
		Query req = em.createQuery("select p from Produit where p.designation like :x");
		req.setParameter("x", mc);
		return req.getResultList();
		
	}

	@Override
	public Produit findone(Long id) {
		Produit p = em.find(Produit.class, id);
		return p;
	}

	@Override
	public Produit update(Produit p) {
        em.merge(p);
        return p ;
	}

	@Override
	public void delete(Long id) {
		Produit p = em.find(Produit.class, id);
		em.remove(p);
	}
	

}
