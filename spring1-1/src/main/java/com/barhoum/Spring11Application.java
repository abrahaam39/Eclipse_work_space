package com.barhoum;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.barhoum.dao.EntityRepository;
import com.barhoum.entitees.Produit;

@SpringBootApplication
public class Spring11Application {

	public static void main(String[] args) {
	ApplicationContext	ctx = SpringApplication.run(Spring11Application.class, args);
	EntityRepository<Produit> produitdao = ctx.getBean(EntityRepository.class);
	//produitdao.save(new Produit("dell",552,2));
	//produitdao.save(new Produit("hp",525,2));
	//produitdao.save(new Produit("asus",522,25));
	List<Produit> prods = produitdao.findall();
	for(Produit p : prods) {
		System.out.println("designation  "+p.getDesignation());
		System.out.println("designation  "+p.getPrix());
		System.out.println("designation  "+p.getQuantite());
	
	}
	List<Produit> prod = produitdao.findmc("%h%");
	for(Produit p : prod) {
		System.out.println("designation  "+p.getDesignation());
		System.out.println("designation  "+p.getPrix());
		System.out.println("designation  "+p.getQuantite());
	}
	}

}
